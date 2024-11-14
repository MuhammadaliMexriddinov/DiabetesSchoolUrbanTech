package uz.alpha.qandlidiabetstartup.data.local

import android.content.Context
import android.content.SharedPreferences
import uz.alpha.qandlidiabetstartup.app.App
import java.util.UUID


/**
Mobile Developer
Creator:Mekhriddinov Muhammadali
 */
class SharedPref private constructor() {

    private val preferences: SharedPreferences =
        App.context!!.getSharedPreferences("PREFERENCES", Context.MODE_PRIVATE)


    companion object {
        private lateinit var myPref: SharedPref

        fun getInstance(): SharedPref {
            if (!this::myPref.isInitialized) {
                myPref = SharedPref()
            }
            return myPref
        }
    }



    fun setName(s: String) {
        preferences.edit().putString("SET", s).apply()
    }

    fun getName() = preferences.getString("SET", " ")

    fun setImage(s: String) {
        preferences.edit().putString("SET1", s).apply()
    }

    fun getImage() = preferences.getString("SET1", " ")


    var language: String?
        get() = preferences.getString("language", "en")
        set(language) {
            preferences.edit().putString("language", language).apply()
        }



    var selectPosition: String?
        get() = preferences.getString("position", "0")
        set(selectPosition) {
            preferences.edit().putString("position", selectPosition).apply()
        }






    val ui= UUID.randomUUID().toString()

    var intExamplePref: String ?
        get() = preferences.getString("APP_PREF_INT_EXAMPLE", ui)
        set(value) = preferences.edit().putString("APP_PREF_INT_EXAMPLE", value).apply()
}