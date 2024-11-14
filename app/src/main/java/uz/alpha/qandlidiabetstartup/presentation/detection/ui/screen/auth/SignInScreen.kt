package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.SharedPref
import uz.alpha.qandlidiabetstartup.databinding.ScreenSignInBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl.SignInViewModelImpl

class SignInScreen : Fragment(R.layout.screen_sign_in) {

    private  val binding by viewBinding(ScreenSignInBinding::bind)
    val uuid = SharedPref.getInstance().intExamplePref
    private val viewModelSignIn by viewModels<SignInViewModelImpl>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.color1)

        binding.apply {
             btnSignIn.setOnClickListener {
                 findNavController().navigate(R.id.mainScreen)
             }
            btnSignUp.setOnClickListener {
                findNavController().navigate(R.id.signUpScreen)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(requireActivity()) {
           findNavController().navigateUp()
        }


        binding.apply {
            btnNext.setOnClickListener {
                if (txtName.text.toString().isNotEmpty() && txtParol.text.toString().endsWith("@gmail.com")){
                    if (uuid != null) {
                        viewModelSignIn.sendData(uuid, txtName.text.toString(), txtParol.text.toString(), "hai2023")
                    }
                }
                else {
                    val snackbar = Snackbar.make(txtParol,requireContext().getString(R.string.dialog_doctor), Snackbar.LENGTH_LONG)
                    snackbar.show()
                }
            }
        }
    }

}