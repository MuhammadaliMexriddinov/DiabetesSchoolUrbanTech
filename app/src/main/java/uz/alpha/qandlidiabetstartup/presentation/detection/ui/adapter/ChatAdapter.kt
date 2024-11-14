package uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.remote.model.chat.PersonalData


class ChatAdapter(private var data: List<PersonalData>) :
    RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {


    inner class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val logo: ImageView = itemView.findViewById(R.id.img)
        val message: TextView = itemView.findViewById(R.id.txtMessage)
        val card: ConstraintLayout = itemView.findViewById(R.id.itemMainCard)
        val txtTime: TextView = itemView.findViewById(R.id.txtTime)




        fun bind() {
            val item = data[absoluteAdapterPosition]
            // image.setImageResource(item.image)
            message.text = item.message
            txtTime.text=item.txtTime

            for (i in 0..data.size-1){
                if (item.author=="m"){
                    card.setBackgroundResource(R.drawable.shape_first)
                }
                if (item.author=="sh"){
                    card.setBackgroundResource(R.drawable.chat_second)
                }
            }

        }


    }

    fun setFilteredList(data: List<PersonalData>) {
        this.data = data
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int = data.size


}