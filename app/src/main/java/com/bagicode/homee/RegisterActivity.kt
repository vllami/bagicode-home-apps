package com.bagicode.homee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnSignUp.setOnClickListener {
            // Ketika di-klik, hapus atau destroy activity ini..
            finish()

            // Kemudian membuka activity baru..
            startActivity(Intent(this, HomeActivity::class.java))

            // Memanggil fungsi untuk animasi back
            back()
        }

        tvLogin.setOnClickListener {
            finish()
            back()
        }
    }

    // Membuat fungsi tekan tombol back dan memanggil fungsi back, agar ketika pengguna menekan tombol back.. itu
    // pergi ke activity sebelumnya
    override fun onBackPressed() = back()

    // Membuat fungsi untuk tombol back
    private fun back() {
        finish()
        overridePendingTransition(R.anim.no_animation, R.anim.slide_out_animation)
    }
}