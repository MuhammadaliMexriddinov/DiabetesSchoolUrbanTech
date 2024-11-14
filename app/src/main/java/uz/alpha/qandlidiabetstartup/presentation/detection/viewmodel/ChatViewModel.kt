package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel

import kotlinx.coroutines.flow.SharedFlow
import uz.alpha.qandlidiabetstartup.data.remote.model.chat.PersonalData

interface ChatViewModel {
    val insertMessage: SharedFlow<PersonalData>
    val allData: SharedFlow<List<PersonalData>>
    fun insertData(data: PersonalData)
    fun getAllData(data: List<PersonalData>)
}