package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.tests

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.SharedPref
import uz.alpha.qandlidiabetstartup.databinding.PageSchoolBinding
import uz.alpha.qandlidiabetstartup.databinding.PageTestBinding

class TestPage : Fragment(R.layout.page_test) {
    private val binding by viewBinding(PageTestBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnDiabet.setOnClickListener {
                findNavController().navigate(R.id.diabetScreen)
            }
            btnFindrisc.setOnClickListener {
                findNavController().navigate(R.id.findRiskScreen)
            }
            btnDR.setOnClickListener {
                findNavController().navigate(R.id.thirdScreen)
            }
            btnDiabeticFoot.setOnClickListener {
                findNavController().navigate(R.id.rakeScreen)
            }
        }
    }
}