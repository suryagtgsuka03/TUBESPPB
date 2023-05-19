package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val btn: Button = findViewById(R.id.app1)
        btn.setOnClickListener {
            val intent = Intent(this, Chat::class.java)
            startActivity(intent)}
        val btn2: Button = findViewById(R.id.app2)
        btn2.setOnClickListener {
            val intent = Intent(this, Kesehatan::class.java)
            startActivity(intent)}
        val btn3: Button = findViewById(R.id.app3)
        btn3.setOnClickListener {
            val intent = Intent(this, Janji::class.java)
            startActivity(intent)}
        val btn4: Button = findViewById(R.id.app4)
        btn4.setOnClickListener {
            val intent = Intent(this, Langganan::class.java)
            startActivity(intent)}
        val btn5: ImageButton = findViewById(R.id.btn_home)
        btn5.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}
        val btn6: ImageButton = findViewById(R.id.btn_cart)
        btn6.setOnClickListener {
            val intent = Intent(this, Keranjang::class.java)
            startActivity(intent)}

    }
}