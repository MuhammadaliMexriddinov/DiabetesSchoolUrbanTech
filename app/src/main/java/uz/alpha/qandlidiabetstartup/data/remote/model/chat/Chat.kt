package uz.alpha.qandlidiabetstartup.data.remote.model.chat

import com.google.firebase.database.DataSnapshot

data class Chat(
    var type: String = "",
    var userName: String = "",
    var message: String = "",
    var countUnread: Int = 0,
)

fun DataSnapshot.toChatData() = Chat(
    this.child("type").getValue(String::class.java) ?: "",
    this.child("userName").getValue(String::class.java) ?: "",
    this.child("message").getValue(String::class.java) ?: "",
    this.child("countUnread").getValue(Int::class.java) ?: 0,
)