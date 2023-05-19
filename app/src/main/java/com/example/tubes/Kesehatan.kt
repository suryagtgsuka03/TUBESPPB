package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Kesehatan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesehatan)

        val btn: ImageButton = findViewById(R.id.back_kesehatan)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}
        val btn1: Button = findViewById(R.id.pnct5)
        btn1.setOnClickListener {
            val intent = Intent(this, Keranjang::class.java)
            startActivity(intent)}
        val btn2: Button = findViewById(R.id.rec)
        btn2.setOnClickListener {
            val intent = Intent(this, Infoobat_toko::class.java)
            startActivity(intent)}
        val btn3: Button = findViewById(R.id.rec2)
        btn3.setOnClickListener {
            val intent = Intent(this, Infoobat_toko::class.java)
            startActivity(intent)}
        val btn4: Button = findViewById(R.id.rec3)
        btn4.setOnClickListener {
            val intent = Intent(this, Infoobat_toko::class.java)
            startActivity(intent)}
        val btn5: Button = findViewById(R.id.rec4)
        btn5.setOnClickListener {
            val intent = Intent(this, Infoobat_toko::class.java)
            startActivity(intent)}

    }
}