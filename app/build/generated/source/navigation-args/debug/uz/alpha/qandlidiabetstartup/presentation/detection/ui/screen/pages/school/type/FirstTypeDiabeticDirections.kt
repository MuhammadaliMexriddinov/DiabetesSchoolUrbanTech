package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class FirstTypeDiabeticDirections private constructor() {
  public companion object {
    public fun actionFirstTypeDiabeticToDailyInsulinScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstTypeDiabetic_to_dailyInsulinScreen)

    public fun actionFirstTypeDiabeticToBreadOneScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstTypeDiabetic_to_breadOneScreen)

    public fun actionFirstTypeDiabeticToInsulinInstructorScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstTypeDiabetic_to_insulinInstructorScreen)
  }
}
