package com.example.tubes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Infoobat_toko : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infoobat_toko)

        val btn: ImageButton = findViewById(R.id.back_infot)
        btn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)}

        val btn1: Button = findViewById(R.id.tambah)
        btn1.setOnClickListener {
            val intent = Intent(this, Keranjang::class.java)
            startActivity(intent)}

    }
}