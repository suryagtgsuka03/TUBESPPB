package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Keranjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang)

        val btn: ImageButton = findViewById(R.id.back_keranjang)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}
        val btn1: Button = findViewById(R.id.pnct1)
        btn1.setOnClickListener {
            val intent = Intent(this, Kesehatan::class.java)
            startActivity(intent)}
        val btn2: Button = findViewById(R.id.btn)
        btn2.setOnClickListener {
            val intent = Intent(this, Infoobat_keranjang::class.java)
            startActivity(intent)}
    }
}