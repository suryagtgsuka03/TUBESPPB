package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Janji_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_janji2)

        val btn: ImageButton = findViewById(R.id.back_janji2)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}
        val btn1: Button = findViewById(R.id.buat1)
        btn1.setOnClickListener {
            val intent = Intent(this, Janji::class.java)
            startActivity(intent)}

    }
}