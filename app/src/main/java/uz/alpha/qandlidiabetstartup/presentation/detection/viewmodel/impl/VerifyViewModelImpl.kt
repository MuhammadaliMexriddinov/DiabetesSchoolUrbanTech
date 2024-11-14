package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.domain.repository.impl.VerifyRepositoryImpl
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.VerifyViewModel


class VerifyViewModelImpl: VerifyViewModel, ViewModel() {
    private val repository =  VerifyRepositoryImpl()
    override val errorMessageSharedFlow: MutableSharedFlow<String> = MutableSharedFlow()
    override val notConnectionSharedFlow: MutableSharedFlow<Unit> = MutableSharedFlow()
    override val succesSharedFlow: MutableSharedFlow<String> = MutableSharedFlow()
    override val progressSharedFlow: MutableSharedFlow<Boolean> = MutableSharedFlow()

    override fun sendData(
        user_device: String,
        code: String,
    ) {

        viewModelScope.launch {

            progressSharedFlow.emit(true)
            if (!hasConnection()) {
                progressSharedFlow.emit(false)
                return@launch
            }

            repository.sendData(
                user_device,
                code,
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