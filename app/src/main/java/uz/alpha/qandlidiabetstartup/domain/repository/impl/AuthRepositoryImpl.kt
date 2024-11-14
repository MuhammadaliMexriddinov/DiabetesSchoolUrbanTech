package uz.alpha.qandlidiabetstartup.domain.repository.impl


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.alpha.qandlidiabetstartup.data.remote.api.ApiClient
import uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse
import uz.alpha.qandlidiabetstartup.domain.repository.AuthRepository

class AuthRepositoryImpl : AuthRepository {

    private val api1 = ApiClient.getAuth()


    override fun sendData(
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
    ): Flow<Result<AuthResponse>> = flow<Result<AuthResponse>> {
        val response = api1.registerAuth(
            imya,
            familiya,
            otchestvo,
            email,
            work,
            phone,
            mobile_phone,
            doljnost,
            apps_name,
            user_device,
            role_name,
            pass,
        )
        if (response.isSuccessful) {
            response.body()?.let {
                emit(Result.success(AuthResponse(it.uniq_code, it.reg_dev)))
            }
        }
    }.catch {
        emit(Result.failure(Exception(it.message)))
    }.flowOn(Dispatchers.IO)

}