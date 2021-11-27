package com.hangular.hangular.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ViewModelProvider
import com.hangular.hangular.databinding.ActivitySplashScreenBinding
import com.hangular.hangular.ui.home.MainActivity
import com.hangular.hangular.ui.home.MainViewModel
import com.hangular.hangular.utils.HangulCaraBaca
import com.hangular.hangular.utils.HangulKonsonan
import com.hangular.hangular.utils.HangulVokal
import com.hangular.hangular.utils.ViewModelFactory

class SplashScreenActivity : AppCompatActivity() {

    lateinit var binding : ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}