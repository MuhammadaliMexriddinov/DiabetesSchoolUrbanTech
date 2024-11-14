package uz.alpha.qandlidiabetstartup.data.remote.api


import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import uz.alpha.qandlidiabetstartup.app.App


object ApiClient {

//    val myClient = OkHttpClient.Builder()
//        .addInterceptor(ChuckerInterceptor(App.context!!))
//        .build()


    private val retrofitExternal: Retrofit = Retrofit.Builder()
            .baseUrl("http://195.158.16.43:6788/")
        //.client(myClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()



    private val retrofitInternal: Retrofit = Retrofit.Builder()
        .baseUrl("http://192.168.100.12:6788/")
      // .client(myClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val retrofitAuth: Retrofit = Retrofit.Builder()
       // .client(myClient)
        .baseUrl("https://apps.tashpmi.uz/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()



    private val retrofitVerify: Retrofit = Retrofit.Builder()
      //  .client(myClient)
        .baseUrl("https://apps.tashpmi.uz/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getInternal(): API = retrofitInternal.create(API::class.java)
    fun getExternal(): API = retrofitExternal.create(API::class.java)

    fun getAuth():API= retrofitAuth.create(API::class.java)
    fun getVerify():API= retrofitVerify.create(API::class.java)

}

