package uz.alpha.qandlidiabetstartup.data.remote.api

import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query
import uz.alpha.qandlidiabetstartup.data.remote.response.AuthResponse
import uz.alpha.qandlidiabetstartup.data.remote.response.DRResponse
import uz.alpha.qandlidiabetstartup.data.remote.response.DiabetResponse
import uz.alpha.qandlidiabetstartup.data.remote.response.RakeResponse
import uz.alpha.qandlidiabetstartup.data.remote.response.SignInResponse
import uz.alpha.qandlidiabetstartup.data.remote.response.VerifyResponse


interface API {

    @GET("/preddiabet")
    suspend fun register(
        @Query("age") age: String,
        @Query("gender") gender: String,
        @Query("polyuria") polyuria: String,
        @Query("polydipsia") polydipsia: String,
        @Query("sudden_weight_loss") sudden_weight_loss: String,
        @Query("weakness") weakness: String,
        @Query("polyphagia") polyphagia: String,
        @Query("genital_thrush") genital_thrush: String,
        @Query("visual_blurring") visual_blurring: String,
        @Query("itching") itching: String,
        @Query("irritability") irritability: String,
        @Query("delayed_healing") delayed_healing: String,
        @Query("partial_paresis") partial_paresis: String,
        @Query("muscle_stiffness") muscle_stiffness: String,
        @Query("alopecia") alopecia: String,
        @Query("obesity") obesity: String,
    ): Response<DiabetResponse>

    @Multipart
    @POST("/dr")
    suspend fun uploadImage(@Part image : MultipartBody.Part):Response<DRResponse>


    @Multipart
    @POST("/stopa")
    suspend fun uploadImageRake(@Part image : MultipartBody.Part):Response<RakeResponse>


    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("/api/add_user")
    suspend fun registerAuth(
        @Field("imya") imya: String,
        @Field("familiya") familiya: String,
        @Field("otchestvo") otchestvo: String,
        @Field("email") email: String,
        @Field("work") work: String,
        @Field("phone") phone: String,
        @Field("mobile_phone") mobile_phone: String,
        @Field("doljnost") doljnost: String,
        @Field("apps_name") apps_name: String,
        @Field("user_device") user_device: String,
        @Field("role_name") role_name: String,
        @Field("pass") pass: String,
    ): Response<AuthResponse>


///api/confirm_email



    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("/api/confirm_email")
    suspend fun registerVerify(
        @Field("user_device") user_device: String,
        @Field("code") code: String,
    ): Response<VerifyResponse>



    @FormUrlEncoded
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("/api/autorization")
    suspend fun registerSignIn(
        @Field("device") user_device: String,
        @Field("login") code: String,
        @Field("pass") pass: String,
        @Field("name_app") name_app: String,
    ): Response<SignInResponse>

}