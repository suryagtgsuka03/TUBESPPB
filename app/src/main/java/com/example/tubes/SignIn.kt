package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)


        val btn: Button = findViewById(R.id.masuk_signin)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}

        val btn1: Button = findViewById(R.id.daftar_signin)
        btn1.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)}
    }
}