package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.ScreenMainBinding

class MainScreen : Fragment(R.layout.screen_main) {

    private  val binding by viewBinding(ScreenMainBinding::bind)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        setupSmoothBottomBar()

        if (savedInstanceState == null) {
            loadFragment(HomePage())
        }
    }

    private fun setupSmoothBottomBar() {
        binding.bottomBar.onItemSelected = { position ->
            val fragment = when (position) {
                0 -> HomePage()
                1 -> CachingPage()
                2 -> InformationScreen()
                3 -> OthersPage()
                else -> HomePage()
            }
            loadFragment(fragment)
        }
    }

    private fun loadFragment(fragment: Fragment) {
        childFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}