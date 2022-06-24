package com.example.jasaonline.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.jasaonline.R
import com.example.jasaonline.helpers.Config
import com.example.jasaonline.helpers.Config.Companion.SPLASH_TIME_OUT

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}