package com.example.email

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cấu hình Edge-to-Edge nếu cần
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Danh sách các tin nhắn mẫu
        val messages = listOf(
            Message("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", true),
            Message("Chris Abad", "Help make Campaign Monitor better", "11:22 AM", false),
            Message("Tuto.com", "8h de formation gratuite", "11:04 AM", true),
            Message("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", true),
            Message("Chris Abad", "Help make Campaign Monitor better", "11:22 AM", false),
            Message("Tuto.com", "8h de formation gratuite", "11:04 AM", true),
            Message("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", true),
            Message("Chris Abad", "Help make Campaign Monitor better", "11:22 AM", false),
            Message("Tuto.com", "8h de formation gratuite", "11:04 AM", true),
            Message("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", true),
            Message("Chris Abad", "Help make Campaign Monitor better", "11:22 AM", false),
            Message("Tuto.com", "8h de formation gratuite", "11:04 AM", true),
            Message("Edurila.com", "$19 Only (First 10 spots)", "12:34 PM", true),
            Message("Chris Abad", "Help make Campaign Monitor better", "11:22 AM", false),
            Message("Tuto.com", "8h de formation gratuite", "11:04 AM", true)
            // Thêm nhiều tin nhắn nếu cần
        )

        // Tìm GridView và gán adapter
        val gridView: GridView = findViewById(R.id.gridView)
        val adapter = MessageAdapter(this, messages)
        gridView.adapter = adapter
    }
}
