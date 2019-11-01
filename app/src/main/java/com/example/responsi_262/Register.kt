package com.example.responsi_262

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        daftarbtn.setOnClickListener{
            val email = findViewById<EditText>(R.id.email)
            val password = findViewById<EditText>(R.id.password)
            if (email.text.isEmpty() || password.text.isEmpty()) {
                Toast.makeText(this, "Email/Password Harus Diisi", Toast.LENGTH_SHORT).show()
            }
            if (email.text.isNotEmpty() && password.text.isNotEmpty()) {
                val intent = Intent(this, Preview::class.java)
                startActivity(intent)
            }
        }

        daftarbtn.setOnClickListener {
            val nama = nama.text.toString()
            val email = email.text.toString()
            val password = password.text.toString()
            val alamat = alamat.text.toString()
            val hp = hp.text.toString()

            val intent = Intent(this@Register, Preview::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Email", email)
            intent.putExtra("Password", password)
            intent.putExtra("Alamat", alamat)
            intent.putExtra("No.Hp", hp)
            startActivity(intent)

        }
    }
}
