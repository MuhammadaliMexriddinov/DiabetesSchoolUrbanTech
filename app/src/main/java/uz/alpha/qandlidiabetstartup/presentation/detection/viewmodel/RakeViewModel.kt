package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.MutableSharedFlow
import okhttp3.MultipartBody

interface RakeViewModel {
    val errorMessageSharedFlow: MutableSharedFlow<String>
    val notConnectionSharedFlow: MutableSharedFlow<Unit>
    val succesSharedFlow: MutableSharedFlow<String>
    val progressSharedFlow: MutableSharedFlow<Boolean>
    fun sendData(
        image : MultipartBody.Part
    )
}