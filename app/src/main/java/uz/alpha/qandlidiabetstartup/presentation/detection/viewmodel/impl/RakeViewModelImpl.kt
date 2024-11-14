package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.domain.repository.impl.RakeRepositoryImpl
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.RakeViewModel

class RakeViewModelImpl : RakeViewModel, ViewModel() {
    private val repository =  RakeRepositoryImpl()
    override val errorMessageSharedFlow: MutableSharedFlow<String> = MutableSharedFlow()
    override val notConnectionSharedFlow: MutableSharedFlow<Unit> = MutableSharedFlow()
    override val succesSharedFlow: MutableSharedFlow<String> = MutableSharedFlow()
    override val progressSharedFlow: MutableSharedFlow<Boolean> = MutableSharedFlow()

    override fun sendData(
        image : MultipartBody.Part
    ) {
        viewModelScope.launch {

            progressSharedFlow.emit(true)
            if (!hasConnection()) {
                progressSharedFlow.emit(false)
                return@launch
            }
            repository.uploadImage(
                image
            ).flowOn(Dispatchers.Main).collect {
                it.onSuccess {
                    progressSharedFlow.emit(false)
                    succesSharedFlow.emit(it)
                }

                it.onFailure {
                    progressSharedFlow.emit(false)
                    errorMessageSharedFlow.emit(it.message.toString())
                }
            }
        }
    }
}