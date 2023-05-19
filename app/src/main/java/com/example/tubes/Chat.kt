package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val btn: ImageButton = findViewById(R.id.back_chat)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}
    }
}