package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class LangScreenDirections private constructor() {
  public companion object {
    public fun actionLangScreenToMainScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_langScreen_to_mainScreen)
  }
}
