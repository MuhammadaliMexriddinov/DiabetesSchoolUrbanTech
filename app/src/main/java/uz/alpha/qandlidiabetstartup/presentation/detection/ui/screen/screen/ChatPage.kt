package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.PageChatBinding

class ChatPage : Fragment(R.layout.page_chat) {

    private val binding by viewBinding(PageChatBinding::bind)


    override fun onViewCreated(view: android.view.View, savedInstanceState: android.os.Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply{
            btn1.setOnClickListener {
                findNavController().navigate(R.id.detailsUserScreen2)
            }
        }
    }
}