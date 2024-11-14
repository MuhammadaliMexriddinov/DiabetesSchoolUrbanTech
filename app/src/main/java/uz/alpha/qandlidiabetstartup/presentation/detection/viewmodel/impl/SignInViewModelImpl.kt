package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse
import uz.alpha.qandlidiabetstartup.domain.repository.impl.SignInRepositoryImpl
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.SignInViewModel

class SignInViewModelImpl: SignInViewModel, ViewModel() {
    private val repository =  SignInRepositoryImpl()
    override val errorMessageSharedFlow: MutableSharedFlow<String> = MutableSharedFlow()
    override val notConnectionSharedFlow: MutableSharedFlow<Unit> = MutableSharedFlow()
    override val succesSharedFlow: MutableSharedFlow<SignInResponse> = MutableSharedFlow()
    override val progressSharedFlow: MutableSharedFlow<Boolean> = MutableSharedFlow()

    override fun sendData(
        user_device: String,
        login: String,
        pass: String,
        name_app: String,
    ) {

        viewModelScope.launch {

            progressSharedFlow.emit(true)
            if (!hasConnection()) {
                progressSharedFlow.emit(false)
                return@launch
            }

            repository.sendData(
                user_device,
                login,
                pass,
                name_app,
            ).flowOn(Dispatchers.Main).collect { it ->
                it.onSuccess {
                    progressSharedFlow.emit(false)
                    succesSharedFlow.emit(it)
                }

                it.onFailure {
                    progressSharedFlow.emit(true)
                    errorMessageSharedFlow.emit("NO INTERNET")
                }
            }
        }
    }
}