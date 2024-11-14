package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class SignInScreenDirections private constructor() {
  public companion object {
    public fun actionSignInScreenToSignUpScreen2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInScreen_to_signUpScreen2)

    public fun actionSignInScreenToVerifyScreen2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInScreen_to_verifyScreen2)

    public fun actionSignInScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInScreen_to_mainScreen)

    public fun actionSignInScreenToDoctorMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInScreen_to_doctorMainScreen)
  }
}
