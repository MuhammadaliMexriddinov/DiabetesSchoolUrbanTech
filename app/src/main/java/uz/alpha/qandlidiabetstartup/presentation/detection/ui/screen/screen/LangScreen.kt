package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.Typeface.BOLD
import android.graphics.Typeface.NORMAL
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.SharedPref
import uz.alpha.qandlidiabetstartup.databinding.ScreenLanguageBinding
import java.util.*

class LangScreen : Fragment(R.layout.screen_language) {
    private val binding by viewBinding(ScreenLanguageBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        boldLangText()
        clickEvents()


    }

    private fun boldLangText(locale: Locale = resources.configuration.locale) = with(binding) {
        txtUz.setTypeface(null, NORMAL)
        txtRu.setTypeface(null, NORMAL)
        txtEn.setTypeface(null, NORMAL)
        when (locale.toLanguageTag()) {
            "uz" -> {
                txtUz.setTypeface(null, BOLD)
            }
            "ru" -> {
                txtRu.setTypeface(null, BOLD)
            }
            "en"->{
                txtEn.setTypeface(null, BOLD)
            }
        }
    }

    private fun clickEvents() = with(binding) {
        btnBack.setOnClickListener {findNavController().navigateUp() }

        l1.setOnClickListener {
            clearAllCheck()
            setLocate("uz")
            txtUz.setTypeface(null, BOLD)
            binding.txtUz.textSize = 22f
           // requireContext().createConfigurationContext(configuration)
            findNavController().navigate(R.id.mainScreen)
        }

        l2.setOnClickListener {
            clearAllCheck()
            setLocate("ru")
            txtRu.setTypeface(null, BOLD)
            binding.txtRu.textSize = 22f
           // requireContext().createConfigurationContext(configuration)
            findNavController().navigate(R.id.mainScreen)

        }
        l3.setOnClickListener {
            clearAllCheck()
            setLocate("en")
            txtEn.setTypeface(null, BOLD)
            binding.txtEn.textSize = 22f
           // requireContext().createConfigurationContext(configuration)
            findNavController().navigate(R.id.mainScreen)

        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            findNavController().navigateUp()
        }

    }

    private var backObserver = androidx.lifecycle.Observer<Unit> {
        findNavController().popBackStack()
    }


    fun clearAllCheck() {
        binding.txtUz.textSize = 18f
        binding.txtRu.textSize = 18f
        binding.txtEn.textSize = 18f
        binding.txtUz.setTypeface(null, NORMAL)
        binding.txtRu.setTypeface(null, NORMAL)
    }

    private fun setLocate(language: String) {
        val resources: Resources = resources
        val metric: DisplayMetrics = resources.displayMetrics
        val configuration = resources.configuration
//        configuration.locale = Locale(language)
        configuration.setLocale(Locale(language))
        context?.createConfigurationContext(requireContext().resources.configuration)
        resources.updateConfiguration(configuration, resources.displayMetrics)
        onConfigurationChanged(configuration)
        SharedPref.getInstance()?.language = language
    }



}