package uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.DialogResultBinding
import uz.alpha.qandlidiabetstartup.databinding.ScreenDeleteBinding
import uz.alpha.qandlidiabetstartup.utils.InfoData

/**
Mobile Developer
Creator:Mekhriddinov Muhammadali
 */
class DeleteDialog(ctx: Context) : Dialog(ctx){

    private lateinit var binding: ScreenDeleteBinding
    private var clickListener: (() -> Unit)? = null
    fun setMainClickListener(block: () -> Unit) {
        clickListener = block
    }

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ScreenDeleteBinding.inflate(layoutInflater)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(binding.root)


        binding.btnCancel.setOnClickListener {
            dismiss()
        }
        binding.btnMain.setOnClickListener {
            clickListener?.invoke()
        }

    }


}

