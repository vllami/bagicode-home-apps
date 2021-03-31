package com.bagicode.homee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_start)

        btnGetStarted.setOnClickListener {
            // Ketika di-klik, hapus atau destroy activity ini..
            finish()

            // Kemudian membuka activity baru..
            startActivity(Intent(this, LoginActivity::class.java))

            // Pergerakan animasi..
            overridePendingTransition(R.anim.slide_in_animation, R.anim.slide_in_out_animation)
        }
    }
}