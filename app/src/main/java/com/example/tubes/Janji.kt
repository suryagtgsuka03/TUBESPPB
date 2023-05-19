package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Janji : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_janji)

        val btn: ImageButton = findViewById(R.id.back_janji)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}
        val btn1: Button = findViewById(R.id.info)
        btn1.setOnClickListener {
            val intent = Intent(this, Janji_2::class.java)
            startActivity(intent)}

    }
}