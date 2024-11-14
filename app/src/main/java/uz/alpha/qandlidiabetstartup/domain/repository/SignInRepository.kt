package uz.alpha.qandlidiabetstartup.domain.repository

import kotlinx.coroutines.flow.Flow
import uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse

interface SignInRepository {
    fun sendData(
        user_device: String,
        code: String,
        pass: String,
        name_app: String,
    ): Flow<Result<SignInResponse>>
}