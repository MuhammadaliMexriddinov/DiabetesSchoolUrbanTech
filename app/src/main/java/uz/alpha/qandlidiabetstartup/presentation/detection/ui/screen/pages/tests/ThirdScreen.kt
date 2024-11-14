package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.tests

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tapadoo.alerter.Alerter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.asRequestBody
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenThirdBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog.DialogResult
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog.StartOpenDialog
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl.DRViewModelImpl
import uz.alpha.qandlidiabetstartup.utils.InfoData

import java.io.File
import java.io.FileOutputStream


class ThirdScreen : Fragment(R.layout.screen_third) {

    private var mProfileUri: Uri? = null
    private val binding by viewBinding(ScreenThirdBinding::bind)
    private val viewModel by viewModels<DRViewModelImpl>()
    lateinit var imageUri: Uri
    private  var isClicked=true

    private val contract =
        registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
            if (uri != null) {
                imageUri = uri
            }
            else {
                binding.btnScoreFirst.visibility=View.VISIBLE
                binding.btnScore.visibility=View.INVISIBLE
                binding.btnSend.visibility=View.INVISIBLE
                // Toast.makeText(requireContext(), "1", Toast.LENGTH_SHORT).show()
            }
            binding.img.setImageURI(uri)
        }
    override fun onResume() {
        super.onResume()

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigateUp()
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigateUp()
        }

        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)


        if(!hasConnection()){
            Alerter.create(requireActivity())
                .setText("NO INTERNET")
                .setBackgroundColorRes(R.color.purple_200)
                .setDuration(5000)
                .show()
        }

        setUp()

        viewModel.succesSharedFlow.onEach {
            if (it == "absence") {
                showDialog(getString(R.string.drno))
                //   dao.insert(DiseaseEntity(0, getString(R.string.drno), getCurrentDate()))
            } else if (it == "too_high") {
                showDialog(getString(R.string.dryes))
                //    dao.insert(DiseaseEntity(0, getString(R.string.dryes), getCurrentDate()))
            } else if (it == "low") {
                showDialog(getString(R.string.dr_low))
            } else if (it == "medium") {
                showDialog(getString(R.string.dr_medium))
            } else if (it == "high") {
                showDialog(getString(R.string.dr_high))
            }

            binding.btnSend.isClickable=true
        }.launchIn(viewLifecycleOwner.lifecycleScope)



        viewModel.progressSharedFlow.onEach {
            if (it) binding.verfiedProgress.show() else binding.verfiedProgress.hide()
        }.launchIn(lifecycleScope)


        viewModel.errorMessageSharedFlow.onEach {
            //  showResult(getString(R.string.msg)," ", R.drawable.no_bg)
        }.launchIn(viewLifecycleOwner.lifecycleScope)

    }

    private fun setUp() {
        binding.apply {

            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
            btnScore.setOnClickListener {
                alertDialog(getString(R.string.dialogUzb2))
            }

            binding.btnScoreFirst.setOnClickListener {
                contract.launch("image/*")
                isClicked=false


                binding.btnScoreFirst.visibility=View.INVISIBLE
                binding.btnScore.visibility=View.VISIBLE
                binding.btnSend.visibility=View.VISIBLE
            }

            btnInfo.setOnClickListener {

            }

            btnSend.setOnClickListener {
                if (hasConnection()){
                    if (!isClicked){
                        binding.verfiedProgress.show()
                        upload()
                        btnSend.isClickable=false
                    }
                    else alertDialog("Rasm qo`yilmadi !")
                }
                else{
                    Alerter.create(requireActivity())
                        .setText("NO INTERNET")
                        .setBackgroundColorRes(R.color.purple_200)
                        .setDuration(5000)
                        .show()
                }
            }
        }
    }

    private fun upload() {
        val filesDir = requireContext().filesDir
        val file = File(filesDir, "image.png")
        val inputStream = requireActivity().contentResolver.openInputStream(imageUri)
        val outputStream = FileOutputStream(file)
        inputStream!!.copyTo(outputStream)
        val requestBody = file.asRequestBody("image/".toMediaTypeOrNull())
        val part = MultipartBody.Part.createFormData("dr_img", file.name, requestBody)

        CoroutineScope(Dispatchers.IO).launch {
            try {
                viewModel.sendData(part)
            }catch (e:Exception){
                //   showResult("Iltimos qaytadan urunib ko`ring !"," ",R.drawable.no_bg)
            }


        }
    }



    private fun showDialog(txt:String){
        InfoData.myCustomChecker="0"
        val dialog = DialogResult(requireContext(), txt, " ")
        dialog.show()
        dialog.setMainClickListener {
            findNavController().navigateUp()
            dialog.dismiss()
        }
    }



    @SuppressLint("ResourceType")
    fun alertDialog(text:String) {
        InfoData.myCustomChecker="0"
        val dialog = StartOpenDialog(requireContext(), text)
        dialog.show()
        dialog.setMainClickListener {
            contract.launch("image/*")
            isClicked=false
            dialog.dismiss()
        }



    }

}