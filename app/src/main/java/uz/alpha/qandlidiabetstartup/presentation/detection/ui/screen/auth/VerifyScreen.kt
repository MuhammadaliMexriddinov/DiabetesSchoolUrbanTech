package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import android.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.SharedPref
import uz.alpha.qandlidiabetstartup.databinding.ScreenVerifyBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl.VerifyViewModelImpl


class VerifyScreen : Fragment(R.layout.screen_verify) {

    private val binding by viewBinding(ScreenVerifyBinding::bind)
    private val viewModel by viewModels<VerifyViewModelImpl>()
    val uuid = SharedPref.getInstance().intExamplePref


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(requireContext(), uuid.toString(), Toast.LENGTH_SHORT).show()
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.color1)


        viewModel.succesSharedFlow.onEach {
            when (it) {
                "good" ->   alertDialogShow(getString(R.string.verify_good), R.drawable.green_warning)
                "bad" ->   alertDialogShow(getString(R.string.verify_bad), R.drawable.warning)
            }
        }.launchIn(viewLifecycleOwner.lifecycleScope)

        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.btnSend.setOnClickListener {
            if (uuid != null) {
                viewModel.sendData(uuid.toString(), binding.inputSmsCode.text.toString())
            }
        }

        viewModel.progressSharedFlow.onEach {
            if (it) binding.verfiedProgress.show() else binding.verfiedProgress.hide()
        }.launchIn(lifecycleScope)


    }

    fun alertDialogShow(pos: String, int: Int) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle(getString(R.string.dta))
        builder.setMessage(pos)
        builder.setIcon(int)

        builder.setPositiveButton(getString(R.string.main)) { dialogInterface, which ->
            findNavController().navigate(R.id.signInScreen)
        }


        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(true)
        alertDialog.show()
    }
}