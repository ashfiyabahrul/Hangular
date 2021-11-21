package com.hangular.hangular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hangular.hangular.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mFragmentManager = supportFragmentManager
    val menuUtama = MenuUtamaFragment()
    val fragment = mFragmentManager.findFragmentByTag(MenuUtamaFragment::class.java.simpleName)
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (fragment !is MenuUtamaFragment) {
            mFragmentManager
                .beginTransaction()
                .add(R.id.menu_utama,menuUtama,MenuUtamaFragment::class.java.simpleName)
                .commit()
        }
    }
}