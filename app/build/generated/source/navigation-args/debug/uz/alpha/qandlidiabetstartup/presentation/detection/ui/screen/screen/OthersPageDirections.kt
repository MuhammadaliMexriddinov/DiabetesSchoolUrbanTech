package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class OthersPageDirections private constructor() {
  public companion object {
    public fun actionOthersPageToLangScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_othersPage_to_langScreen)

    public fun actionOthersPageToAppInformationScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_othersPage_to_appInformationScreen)
  }
}
