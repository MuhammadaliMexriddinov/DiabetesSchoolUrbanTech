package uz.alpha.qandlidiabetstartup.domain.repository.impl

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.alpha.qandlidiabetstartup.data.remote.api.ApiClient
import uz.alpha.qandlidiabetstartup.domain.repository.VerifyRepository

class VerifyRepositoryImpl : VerifyRepository {
    private val api1 = ApiClient.getVerify()


    override fun sendData(
        user_device: String,
        code: String,
    ): Flow<Result<String>> = flow<Result<String>> {
        Log.d("KKK", "Repo $code")
        val response = api1.registerVerify(
                user_device,
            code
        )
        if (response.isSuccessful) {
            response.body()?.let {
                emit(Result.success(it.result))
            }
        }
    }.catch {
        emit(Result.failure(Exception(it.message)))
    }.flowOn(Dispatchers.IO)
}