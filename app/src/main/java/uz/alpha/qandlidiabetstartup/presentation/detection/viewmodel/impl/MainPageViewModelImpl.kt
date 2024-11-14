package uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.MainPageViewModel


class MainViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    // selectPosition qiymatini saqlash va qayta o'qish
    var selectPosition: String
        get() = savedStateHandle["selectPosition"] ?: "0"
        set(value) {
            savedStateHandle["selectPosition"] = value
        }
}


