package com.example.responsi_262

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_preview.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.view.*

class Preview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val email = intent.getStringExtra("Email")
        var password = intent.getStringExtra("Password")
        val alamat = intent.getStringExtra("Alamat")
        val hp = intent.getStringExtra("No.Hp")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NIM : "+nama+"\nNama: "+email+"\nNilai: "+password+"\nAlamat : "+alamat+"\nNo.Hp :"+hp

        pindahlogin.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
