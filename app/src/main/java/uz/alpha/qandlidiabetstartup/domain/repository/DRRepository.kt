package uz.alpha.qandlidiabetstartup.domain.repository

import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody
import java.io.File

interface DRRepository {

    fun uploadImage(image : MultipartBody.Part):Flow<Result<String>>

}