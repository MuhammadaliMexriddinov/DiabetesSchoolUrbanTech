package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.SharedFlow

interface StartViewModel
{
  val openDiabetFlow :SharedFlow<Unit>
  fun openDiabetScreen()

  val openFindRiscFlow: SharedFlow<Unit>
  fun openFindRiscScreen()

  val openDRFlow:SharedFlow<Unit>
  fun openDRScreen()
}