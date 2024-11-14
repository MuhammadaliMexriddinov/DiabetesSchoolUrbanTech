package uz.alpha.qandlidiabetstartup.domain.repository

import kotlinx.coroutines.flow.Flow
import retrofit2.http.Field

interface VerifyRepository {
    fun sendData(
      user_device: String,
      code: String,
    ): Flow<Result<String>>
}