package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class SignUpScreenDirections private constructor() {
  public companion object {
    public fun actionSignUpScreenToVerifyScreen2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpScreen_to_verifyScreen2)

    public fun actionSignUpScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpScreen_to_mainScreen)
  }
}
