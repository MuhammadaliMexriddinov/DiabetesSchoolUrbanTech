package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import uz.alpha.diabetaithreecategory.utils.hasConnection
import uz.alpha.qandlidiabetstartup.domain.repository.impl.DRRepositoryImpl
import uz.alpha.qandlidiabetstartup.domain.repository.impl.RakeRepositoryImpl
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.DRViewModel
import java.io.File
import javax.inject.Inject


class DRViewModelImpl  : DRViewModel,
    ViewModel() {

    private val repository =  DRRepositoryImpl()
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