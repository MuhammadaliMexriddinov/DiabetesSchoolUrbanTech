package uz.alpha.qandlidiabetstartup.domain.repository

import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query
import uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse

interface AuthRepository {
    fun sendData(
        imya: String,
        familiya: String,
        otchestvo: String,
        email: String,
        work: String,
        phone: String,
        mobile_phone: String,
        doljnost: String,
        apps_name: String,
        user_device: String,
        role_name: String,
        pass: String,
    ): Flow<Result<AuthResponse>>
}