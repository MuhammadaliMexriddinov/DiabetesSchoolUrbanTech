package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class VerifyScreenDirections private constructor() {
  public companion object {
    public fun actionVerifyScreenToSignInScreen2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_verifyScreen_to_signInScreen2)

    public fun actionVerifyScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_verifyScreen_to_mainScreen)
  }
}
