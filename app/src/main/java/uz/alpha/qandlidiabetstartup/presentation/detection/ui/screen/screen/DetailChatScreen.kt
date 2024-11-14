package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.activity.addCallback
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.remote.model.chat.PersonalData
import uz.alpha.qandlidiabetstartup.data.remote.model.chat.toPersonalData
import uz.alpha.qandlidiabetstartup.databinding.PageDoctorChatBinding
import uz.alpha.qandlidiabetstartup.databinding.ScreenChatDetailBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.ChatAdapter
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl.ChatViewModelImpl
import uz.alpha.qandlidiabetstartup.utils.CheckingKey
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class DetailChatScreen: Fragment(R.layout.screen_chat_detail) {

    private val binding by viewBinding(ScreenChatDetailBinding::bind)
    private val listMessage = ArrayList<PersonalData>()
    val database = FirebaseDatabase.getInstance().reference
    var reference = database.ref.child("Users")
    val adapter = ChatAdapter(listMessage)
    private  var isOnlineChecked=0
    private val viewModel by viewModels<ChatViewModelImpl>()


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.doctorMainScreen)

        }

        binding.btnBack.setOnClickListener {
            findNavController().navigate(R.id.doctorMainScreen)
        }

        if ( CheckingKey.singlePerson == "sh"){
            binding.txtPersonal.text="User"
        }
        if ( CheckingKey.singlePerson == "m"){
            binding.txtPersonal.text="Doctor"
        }



        if (!hasConnection()){
            val builder = AlertDialog.Builder(requireContext())
            //set title for alert dialog
            builder.setTitle("NO INTERNET ")
            //set message for alert dialog
            builder.setMessage("Please turn on the internet ")


            //performing cancel action
            builder.setPositiveButton("OK") { dialogInterface, which ->

            }

            val alertDialog: AlertDialog = builder.create()

            alertDialog.setCancelable(false)
            alertDialog.show()

            binding.verfiedProgress.show()
        }


        lifecycleScope.launch {
            binding.verfiedProgress.show()
            delay(3000)
            binding.verfiedProgress.hide()
        }

        viewModel.allData.onEach {

            binding.listRv.adapter = adapter

            val layoutManager = LinearLayoutManager(context)
            layoutManager.stackFromEnd = true
            binding.listRv.layoutManager = layoutManager


        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.btnSendMessage.setOnClickListener {
            if (binding.inputMessage.text.isNotEmpty()){
                insertData()
                binding.listRv.smoothScrollToPosition(adapter.itemCount)
                adapter.notifyItemInserted(adapter.itemCount)
                binding.inputMessage.text.clear()
                //    hideKeyBoard()
            }
            else Toast.makeText(requireContext(), "Xabar yozilmagan !", Toast.LENGTH_SHORT).show()

        }
        retrieveAllData()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun insertData() {

        val currentTime = LocalTime.now()
        val currentDate = LocalDate.now()
        val dateFormatter = DateTimeFormatter.ofPattern("dd/MM")
        val formattedDate = currentDate.format(dateFormatter)
        var realTime :String =currentTime.hour.toString() + ":"+currentTime.minute.toString()+" ("+formattedDate+")"

        var send="VALI"
        val inputMessage = binding.inputMessage.text.toString()
        var id = reference.push().key
        if (CheckingKey.singlePerson=="m") send="m"
        if (CheckingKey.singlePerson=="sh") send="sh"
        reference.child(id!!).setValue(PersonalData(0, send, inputMessage, realTime))
    }

    @SuppressLint("SuspiciousIndentation")
    private fun hideKeyBoard() {
        val view: View? = requireActivity().currentFocus
        if (view != null) {
            val inputMethodManager =
                requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun retrieveAllData() {
        reference.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val list = dataSnapshot.children.map { it.toPersonalData()  }
                listMessage.clear()
                listMessage.addAll(list)
                viewModel.getAllData(list)

                var getMyProfile= dataSnapshot.toPersonalData()
                when(getMyProfile.author){
                    "m"-> CheckingKey.singlePerson="first"
                    "sh"-> CheckingKey.singlePerson="second"
                }









//                for (snapshot in dataSnapshot.children) {
//                    val data = dataSnapshot.children.map { it.toPersonalData() }
//
//                    for (i in 0..data.size-1){
//                        Log.d("LLL", data[i].author)
//
//                        if (data[i].author=="m"){
//                           CheckingKey.checkingSinglePerson="m"
//                        }
//
//                        if (data[i].author=="sh"){
//                            CheckingKey.checkingSinglePerson="sh"
//                        }
//                    }
//
//                }

            }

            override fun onCancelled(databaseError: DatabaseError) {
                // Failed to read value
                Log.d("FirebaseData", "Failed to read value.", databaseError.toException())
            }
        })
    }
}



