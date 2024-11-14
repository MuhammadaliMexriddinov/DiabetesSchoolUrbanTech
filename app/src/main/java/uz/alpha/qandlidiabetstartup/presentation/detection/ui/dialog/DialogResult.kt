package uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.databinding.DialogChangeNameBinding
import uz.alpha.qandlidiabetstartup.databinding.DialogResultBinding
import uz.alpha.qandlidiabetstartup.utils.InfoData

class DialogResult(ctx: Context, private val name: String , private  val description:String) : Dialog(ctx) {

    private lateinit var binding: DialogResultBinding
    private var clickListener: (() -> Unit)? = null
    fun setMainClickListener(block: () -> Unit) {
        clickListener = block
    }

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DialogResultBinding.inflate(layoutInflater)
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        setContentView(binding.root)

        binding.tvName.text = name
        binding.tvDescription.text= description

        when(InfoData.myCustomChecker){
            "0"->binding.tvDescription.visibility=View.GONE
            "1"->binding.tvDescription.visibility=View.VISIBLE
        }

        binding.btnCancel.setOnClickListener {
            dismiss()
        }
        binding.btnMain.setOnClickListener {
           clickListener?.invoke()
        }

    }

}