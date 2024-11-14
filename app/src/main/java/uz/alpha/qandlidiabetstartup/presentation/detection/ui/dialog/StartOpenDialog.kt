package uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import uz.alpha.qandlidiabetstartup.databinding.DialogResultBinding
import uz.alpha.qandlidiabetstartup.databinding.DialogStartOpenBinding

class StartOpenDialog(ctx: Context, private val name: String) : Dialog(ctx) {

    private lateinit var binding: DialogStartOpenBinding
    private var clickListener: (() -> Unit)? = null
    fun setMainClickListener(block: () -> Unit) {
        clickListener = block
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DialogStartOpenBinding.inflate(layoutInflater)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(binding.root)

        binding.tvName.text = name

        binding.btnCancel.setOnClickListener {
            dismiss()
        }
        binding.btnMain.setOnClickListener {
            clickListener?.invoke()
        }

    }

}