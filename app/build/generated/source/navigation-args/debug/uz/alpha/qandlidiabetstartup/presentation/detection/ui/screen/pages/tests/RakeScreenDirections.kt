package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.tests

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class RakeScreenDirections private constructor() {
  public companion object {
    public fun actionRakeScreenToLangScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_rakeScreen_to_langScreen)
  }
}
