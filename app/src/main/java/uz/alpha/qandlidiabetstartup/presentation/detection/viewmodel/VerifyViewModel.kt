package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.MutableSharedFlow

interface VerifyViewModel {
    val errorMessageSharedFlow: MutableSharedFlow<String>
    val notConnectionSharedFlow: MutableSharedFlow<Unit>
    val succesSharedFlow: MutableSharedFlow<String>
    val progressSharedFlow: MutableSharedFlow<Boolean>
    fun sendData(
        user_device: String,
        code: String,
    )
}