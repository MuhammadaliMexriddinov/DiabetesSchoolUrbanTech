package uz.alpha.qandlidiabetstartup.domain.repository.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withTimeoutOrNull
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import uz.alpha.qandlidiabetstartup.data.remote.api.ApiClient
import uz.alpha.qandlidiabetstartup.domain.repository.RakeRepository
import java.io.File

class RakeRepositoryImpl : RakeRepository {
    private val api1 = ApiClient.getExternal()
    private val api2 = ApiClient.getInternal()

    override fun uploadImage(image: MultipartBody.Part): Flow<Result<String>> =
        flow<Result<String>> {
            val response = withTimeoutOrNull(3500) {
                val response = api1.uploadImageRake(
                    image
                )
                if (response.isSuccessful) {
                    response.body()?.let {
                        emit(Result.success(it.result))
                    }
                }
            }
            if (response != null) {
                // Handle response
            } else {
                val response2 = api2.uploadImageRake(
                    image
                )

                if (response2.isSuccessful) {
                    response2.body()?.let {
                        emit(Result.success(it.result))
                    }
                } else {
                    emit(Result.failure(Exception("INTERNAL SERVER ERROR")))
                }
            }
        }.catch {
            emit(Result.failure(Exception(it.message)))
        }.flowOn(Dispatchers.IO)
}