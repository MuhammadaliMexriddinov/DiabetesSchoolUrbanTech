package uz.alpha.qandlidiabetstartup.domain.repository

import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody
import java.io.File

interface RakeRepository {
    fun uploadImage(image : MultipartBody.Part):Flow<Result<String>>

}