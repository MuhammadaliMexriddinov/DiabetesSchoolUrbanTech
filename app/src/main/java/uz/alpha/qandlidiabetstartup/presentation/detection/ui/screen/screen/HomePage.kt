package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.SharedPref
import uz.alpha.qandlidiabetstartup.databinding.LayoutHomeBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.MainTabAdapter
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl.MainViewModel


class HomePage : Fragment(R.layout.layout_home) {

    private val viewModel by viewModels<MainViewModel>()
    private val binding by viewBinding(LayoutHomeBinding::bind)
    private var pref = SharedPref.getInstance()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pageMain.adapter = MainTabAdapter(requireActivity())
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.color1)
        updateTabUI(viewModel.selectPosition)

        binding.apply {
            btnTab1.setOnClickListener {
                pageMain.currentItem = 0
                viewModel.selectPosition = "0"
                updateTabUI(viewModel.selectPosition)
            }
            btnTab2.setOnClickListener {
                pageMain.currentItem = 1
                viewModel.selectPosition = "1"
                updateTabUI(viewModel.selectPosition)
            }

            pageMain.isUserInputEnabled = true
        }

        binding.apply {
            btnLanguage.setOnClickListener {
                findNavController().navigate(R.id.langScreen)
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(requireActivity()) {
            findNavController().navigateUp()
        }

    }

    private fun updateTabUI(selectPosition: String) {
        if (selectPosition == "0") {
            binding.btnTab1.setBackgroundResource(R.drawable.shapegreen)
            binding.btnTab2.setBackgroundResource(R.drawable.shapewhite)
            binding.txtTab1.setTextColor(resources.getColor(R.color.white))
            binding.txtTab2.setTextColor(resources.getColor(R.color.purple_200))
        } else {
            binding.btnTab2.setBackgroundResource(R.drawable.shapegreen)
            binding.btnTab1.setBackgroundResource(R.drawable.shapewhite)
            binding.txtTab1.setTextColor(resources.getColor(R.color.purple_200))
            binding.txtTab2.setTextColor(resources.getColor(R.color.white))
        }
    }




}