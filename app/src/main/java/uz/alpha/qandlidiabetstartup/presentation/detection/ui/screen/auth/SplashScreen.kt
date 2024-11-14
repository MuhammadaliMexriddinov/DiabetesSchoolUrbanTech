package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenSplashBinding

@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment(R.layout.screen_splash) {


    private  val binding by viewBinding(ScreenSplashBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.color1)


        lifecycleScope.launch {
            delay(3000)
            findNavController().navigate(R.id.signInScreen)
        }

        binding.apply {
            val animationSlideUp =
                AnimationUtils.loadAnimation(requireContext(), R.anim.slide_up)
            imgLogo.startAnimation(animationSlideUp)
            imgLogo.visibility = View.VISIBLE
        }

    }
}