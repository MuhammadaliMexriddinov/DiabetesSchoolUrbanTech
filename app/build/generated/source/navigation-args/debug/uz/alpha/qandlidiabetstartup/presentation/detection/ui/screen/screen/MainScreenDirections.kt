package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class MainScreenDirections private constructor() {
  public companion object {
    public fun actionMainScreenToThirdScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_thirdScreen)

    public fun actionMainScreenToDiabetScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_diabetScreen)

    public fun actionMainScreenToFirstTypeDiabetic(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_firstTypeDiabetic)

    public fun actionMainScreenToRakeScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_rakeScreen)

    public fun actionMainScreenToInformationScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_informationScreen)

    public fun actionMainScreenToLangScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_langScreen)

    public fun actionMainScreenToNeuroAssistantScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_neuroAssistantScreen)

    public fun actionMainScreenToSecondTypeDiabetic(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainScreen_to_secondTypeDiabetic)
  }
}
