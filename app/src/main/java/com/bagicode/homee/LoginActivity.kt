package com.bagicode.homee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin.setOnClickListener {
            // Kemudian membuka activity baru..
            startActivity(Intent(this, HomeActivity::class.java))

            // Pergerakan animasi..
            overridePendingTransition(R.anim.slide_in_animation, R.anim.slide_in_out_animation)
        }

        tvSignUp.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            overridePendingTransition(R.anim.slide_in_animation, R.anim.slide_in_out_animation)
        }
    }

    // Membuat fungsi tekan tombol back, agar pengguna dapat menekan tombol back ke activity sebelumnya
    override fun onBackPressed() {
        finish()
    }
}