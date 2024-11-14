package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenFirsttypeBinding

class FirstTypeDiabetic  : Fragment(R.layout.screen_firsttype) {


    private  val binding by viewBinding(ScreenFirsttypeBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)


        binding.apply {
            btnBack.setOnClickListener {
                findNavController().navigate(R.id.mainScreen)
            }
            btnIndtructor.setOnClickListener {
                findNavController().navigate(R.id.insulinInstructorScreen)
            }

            btnBread.setOnClickListener {
                findNavController().navigate(R.id.breadOneScreen)
            }

            btnInsulin.setOnClickListener {
                findNavController().navigate(R.id.dailyInsulinScreen)
            }
            btnpdf.setOnClickListener {
                val browserIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://docs.google.com/document/d/1U2mXx69e1haA3zShUVRN4gRHwUqWDvTMQhCeW4hogQ0/edit?usp=sharing")
                )
                startActivity(browserIntent)
            }

        }

    }

}

