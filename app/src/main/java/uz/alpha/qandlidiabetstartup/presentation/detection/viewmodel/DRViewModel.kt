package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import okhttp3.MultipartBody
import java.io.File

interface DRViewModel {

    val errorMessageSharedFlow: MutableSharedFlow<String>
    val notConnectionSharedFlow: MutableSharedFlow<Unit>
    val succesSharedFlow: MutableSharedFlow<String>
    val progressSharedFlow: MutableSharedFlow<Boolean>
    fun sendData(
        image : MultipartBody.Part
    )

}