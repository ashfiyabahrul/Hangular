package com.hangular.hangular.ui.vocal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hangular.hangular.R
import com.hangular.hangular.databinding.ActivityHangulVocalBinding

class HangulVocalActivity : AppCompatActivity() {

    lateinit var binding: ActivityHangulVocalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHangulVocalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}