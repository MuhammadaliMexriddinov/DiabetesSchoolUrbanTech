package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.PageSchoolBinding

class SchoolPage : Fragment(R.layout.page_school) {

    private val binding by viewBinding(PageSchoolBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply{
            btnFirstType.setOnClickListener {
               findNavController().navigate(R.id.firstTypeDiabetic)
            }
            btnSecondType.setOnClickListener {
                findNavController().navigate(R.id.secondTypeDiabetic)
            }
            btnNeuroAssistant.setOnClickListener {
                findNavController().navigate(R.id.neuroAssistantScreen)
            }
        }

    }

}