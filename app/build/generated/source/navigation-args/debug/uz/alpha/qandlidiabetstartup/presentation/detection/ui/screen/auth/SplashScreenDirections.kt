package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class SplashScreenDirections private constructor() {
  public companion object {
    public fun actionSplashScreenToSignInScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashScreen_to_signInScreen)
  }
}
