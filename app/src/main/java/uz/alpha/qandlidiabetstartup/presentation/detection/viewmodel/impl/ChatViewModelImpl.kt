package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import uz.alpha.qandlidiabetstartup.data.remote.model.chat.PersonalData
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.ChatViewModel

class ChatViewModelImpl : ChatViewModel, ViewModel() {
    override val insertMessage = MutableSharedFlow<PersonalData>()
    override val allData = MutableSharedFlow<List<PersonalData>>()



    override fun insertData(data: PersonalData) {
        viewModelScope.launch {
            insertMessage.emit(data)
        }
    }

    override fun getAllData(data: List<PersonalData>) {
        viewModelScope.launch {
            allData.emit(data)
        }
    }
}