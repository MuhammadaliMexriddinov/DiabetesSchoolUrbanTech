package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.doctor

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
import kotlinx.coroutines.launch
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.remote.model.chat.PersonalData
import uz.alpha.qandlidiabetstartup.databinding.PageDoctorChatBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.ChatAdapter
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class DoctorChatPage : Fragment(R.layout.page_doctor_chat) {

    private val binding by viewBinding(PageDoctorChatBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {
            btn1.setOnClickListener {
                findNavController().navigate(R.id.detailChatScreen)
            }
        }
    }


}