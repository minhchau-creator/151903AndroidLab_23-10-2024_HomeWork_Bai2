package com.example.email

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.CheckBox
import android.widget.TextView
import com.example.email.R

// MessageAdapter.kt
class MessageAdapter(private val context: Context, private val messages: List<Message>) : BaseAdapter() {

    override fun getCount() = messages.size

    override fun getItem(position: Int) = messages[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.activity_itembox_layout, parent, false)
        val message = messages[position]

        val tvSender: TextView = view.findViewById(R.id.tvSender)
        val tvSubject: TextView = view.findViewById(R.id.tvSubject)
        val tvTime: TextView = view.findViewById(R.id.tvTime)
        val ivStar: CheckBox = view.findViewById(R.id.ivStar) // Đảm bảo ivStar là CheckBox

        tvSender.text = message.sender
        tvSubject.text = message.subject
        tvTime.text = message.time
        ivStar.isChecked = message.isStarred

        return view
    }
}
