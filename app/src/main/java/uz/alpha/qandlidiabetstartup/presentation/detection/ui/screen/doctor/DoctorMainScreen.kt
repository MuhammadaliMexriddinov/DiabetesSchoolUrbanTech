package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.doctor

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenDoctorBinding
import uz.alpha.qandlidiabetstartup.databinding.ScreenMainBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen.CachingPage
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen.HomePage
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen.InformationScreen
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen.OthersPage

class DoctorMainScreen : Fragment(R.layout.screen_doctor) {

    private  val binding by viewBinding(ScreenDoctorBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setupSmoothBottomBar()

        if (savedInstanceState == null) {
            loadFragment(DoctorHomePage())
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigate(R.id.signInScreen)
        }
    }

    private fun setupSmoothBottomBar() {
        binding.bottomBar.onItemSelected = { position ->
            val fragment = when (position) {
                0 -> DoctorHomePage()
                1 -> DoctorChatPage()
                2 -> OthersPage()
                else -> DoctorHomePage()
            }
            loadFragment(fragment)
        }
    }

    private fun loadFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}

//Muhammadali Mexriddinov