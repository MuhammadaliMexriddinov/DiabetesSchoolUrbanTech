package uz.alpha.qandlidiabetstartup.data.remote.model.chat

import com.google.firebase.database.DataSnapshot

data class PersonalData(
    var id:Int=0, //online 1 , 0
    var author : String="",
    var message :String="",
    var txtTime: String = "",
)

fun DataSnapshot.toPersonalData() = PersonalData(
    this.child("id").getValue(Int::class.java) ?: 0,
    this.child("author").getValue(String::class.java) ?: "",
    this.child("message").getValue(String::class.java) ?: "",
    this.child("txtTime").getValue(String::class.java) ?: ""
)