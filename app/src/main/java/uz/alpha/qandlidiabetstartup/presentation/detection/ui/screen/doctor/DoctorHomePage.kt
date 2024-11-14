package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.doctor

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.PageDoctorMainBinding

class DoctorHomePage : Fragment(R.layout.page_doctor_main) {

    private val binding by viewBinding(PageDoctorMainBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btn1.setOnClickListener {
                findNavController().navigate(R.id.cachingScreen)
            }
            btn2.setOnClickListener {
                findNavController().navigate(R.id.cachingScreen)
            }
            btn3.setOnClickListener {
                findNavController().navigate(R.id.cachingScreen)
            }

            btnLogout.setOnClickListener {
                findNavController().navigate(R.id.signInScreen)
            }
        }
    }
}