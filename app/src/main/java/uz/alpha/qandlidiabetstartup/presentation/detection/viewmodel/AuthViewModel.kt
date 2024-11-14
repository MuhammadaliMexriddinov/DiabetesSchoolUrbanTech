package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.MutableSharedFlow
import uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse

interface AuthViewModel {
    val errorMessageSharedFlow: MutableSharedFlow<String>
    val notConnectionSharedFlow: MutableSharedFlow<Unit>
    val succesSharedFlow: MutableSharedFlow<AuthResponse>
    val progressSharedFlow: MutableSharedFlow<Boolean>
    fun sendData(
        imya: String,
        familiya: String,
        otchestvo: String,
        email: String,
        work: String,
        phone: String,
        mobile_phone: String,
        doljnost: String,
        apps_name: String,
        user_device: String,
        role_name: String,
        pass: String,
    )
}