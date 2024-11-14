package uz.alpha.qandlidiabetstartup.domain.repository.impl

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.alpha.qandlidiabetstartup.data.remote.api.ApiClient
import uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse
import uz.alpha.qandlidiabetstartup.domain.repository.SignInRepository

class SignInRepositoryImpl : SignInRepository {
    private val api1 = ApiClient.getVerify()


    override fun sendData(
         user_device: String,
         code: String,
         pass: String,
         name_app: String,
    ): Flow<Result<SignInResponse>> = flow<Result<SignInResponse>> {

        val response = api1.registerSignIn(
            user_device,
            code,
            pass,
            name_app,
        )
        if (response.isSuccessful) {
            response.body()?.let {
                emit(Result.success(it))
            }
        }
    }.catch {
        emit(Result.failure(Exception(it.message)))
    }.flowOn(Dispatchers.IO)
}