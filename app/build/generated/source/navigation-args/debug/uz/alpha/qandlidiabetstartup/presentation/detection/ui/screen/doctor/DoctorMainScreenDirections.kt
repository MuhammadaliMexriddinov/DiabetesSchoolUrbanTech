package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.doctor

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import uz.alpha.qandlidiabetstartup.R

public class DoctorMainScreenDirections private constructor() {
  public companion object {
    public fun actionDoctorMainScreenToInformationScreen(): NavDirections =
        ActionOnlyNavDirections(R.id.action_doctorMainScreen_to_informationScreen)
  }
}
