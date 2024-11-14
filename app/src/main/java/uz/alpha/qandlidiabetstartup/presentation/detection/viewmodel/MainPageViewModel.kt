package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.MutableSharedFlow

interface MainPageViewModel {
    val eventSharedFlow: MutableSharedFlow<Boolean>
    fun manageState()
}