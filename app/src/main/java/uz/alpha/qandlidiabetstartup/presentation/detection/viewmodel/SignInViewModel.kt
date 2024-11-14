package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.MutableSharedFlow
import uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse


interface SignInViewModel {
    val errorMessageSharedFlow: MutableSharedFlow<String>
    val notConnectionSharedFlow: MutableSharedFlow<Unit>
    val succesSharedFlow: MutableSharedFlow<SignInResponse>
    val progressSharedFlow: MutableSharedFlow<Boolean>
    fun sendData(
        user_device: String,
        login: String,
        pass: String,
        name_app: String,
    )
}