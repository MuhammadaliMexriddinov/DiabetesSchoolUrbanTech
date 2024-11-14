package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type1

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenInstructorBinding

class InsulinInstructorScreen : Fragment(R.layout.screen_instructor) {

    private  val binding by viewBinding(ScreenInstructorBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)


        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}