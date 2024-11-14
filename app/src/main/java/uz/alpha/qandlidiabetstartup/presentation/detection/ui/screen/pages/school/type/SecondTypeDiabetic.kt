package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenFoodsBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.FoodsAdapter

class SecondTypeDiabetic : Fragment(R.layout.screen_foods) {

    private  val binding by viewBinding(ScreenFoodsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)

        binding.pageMain.adapter = FoodsAdapter(requireActivity())

        binding.apply {
            btnGreen.setOnClickListener {
                pageMain.currentItem = 0
                view1.visibility=View.VISIBLE
                view2.visibility=View.INVISIBLE
                view3.visibility=View.INVISIBLE
                f1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green_special))
                requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)
                foodsview.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green_special))
            }
            btnYellow.setOnClickListener {
                pageMain.currentItem = 1
                view1.visibility=View.INVISIBLE
                view2.visibility=View.VISIBLE
                view3.visibility=View.INVISIBLE
                f1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.yellow_special))
                requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.yellow_special)
                foodsview.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.yellow_special))


            }

            btnRed.setOnClickListener {
                pageMain.currentItem = 3
                view1.visibility=View.INVISIBLE
                view2.visibility=View.INVISIBLE
                view3.visibility=View.VISIBLE
                f1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red_special))
                requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.red_special)
                foodsview.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.red_special))


            }
            pageMain.isUserInputEnabled = false


            btnBack.setOnClickListener {
                findNavController().navigate(R.id.mainScreen)
            }

        }



    }
}