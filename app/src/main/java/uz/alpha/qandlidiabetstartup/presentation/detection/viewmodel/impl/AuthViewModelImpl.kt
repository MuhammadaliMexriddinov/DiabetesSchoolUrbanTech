package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse
import uz.alpha.qandlidiabetstartup.domain.repository.impl.AuthRepositoryImpl
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.AuthViewModel

class AuthViewModelImpl : AuthViewModel, ViewModel() {

    private val repository =  AuthRepositoryImpl()
    override val errorMessageSharedFlow: MutableSharedFlow<String> = MutableSharedFlow()
    override val notConnectionSharedFlow: MutableSharedFlow<Unit> = MutableSharedFlow()
    override val succesSharedFlow: MutableSharedFlow<AuthResponse> = MutableSharedFlow()
    override val progressSharedFlow: MutableSharedFlow<Boolean> = MutableSharedFlow()

    override fun sendData(
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
    ) {
        viewModelScope.launch {

            progressSharedFlow.emit(true)
            if (!hasConnection()) {
                progressSharedFlow.emit(false)
                return@launch
            }

            repository.sendData(
                imya,
                familiya,
                otchestvo,
                email,
                work,
                phone,
                mobile_phone,
                doljnost,
                apps_name,
                user_device,
                role_name,
                pass,
            ).flowOn(Dispatchers.Main).collect { it ->
                it.onSuccess {
                    progressSharedFlow.emit(false)
                    succesSharedFlow.emit(AuthResponse(it.uniq_code, it.reg_dev))
                }

                it.onFailure {
                    progressSharedFlow.emit(true)
                    errorMessageSharedFlow.emit("NO INTERNET")
                }
            }
        }
    }
}