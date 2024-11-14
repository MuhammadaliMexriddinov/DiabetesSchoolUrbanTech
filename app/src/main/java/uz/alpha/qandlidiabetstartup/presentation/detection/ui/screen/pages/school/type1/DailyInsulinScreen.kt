package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenDailyinsulinBinding
import kotlin.random.Random

class DailyInsulinScreen : Fragment(R.layout.screen_dailyinsulin) {

    private  val binding by viewBinding(ScreenDailyinsulinBinding::bind)

    @SuppressLint("SetJavaScriptEnabled")
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