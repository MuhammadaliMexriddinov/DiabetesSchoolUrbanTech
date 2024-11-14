package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenAssistantBinding
import uz.alpha.qandlidiabetstartup.databinding.ScreenFoodsBinding

class NeuroAssistantScreen  : Fragment(R.layout.screen_assistant){

    private  val binding by viewBinding(ScreenAssistantBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)


        binding.apply {

        }
    }
}