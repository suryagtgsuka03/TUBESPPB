package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)



        val btn: Button = findViewById(R.id.masuk_signup)
        btn.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)}


    }
}