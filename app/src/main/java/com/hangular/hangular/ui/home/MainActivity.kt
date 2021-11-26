package com.hangular.hangular.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.hangular.hangular.R
import com.hangular.hangular.databinding.ActivityMainBinding
import com.hangular.hangular.utils.HangulCaraBaca
import com.hangular.hangular.utils.HangulKonsonan
import com.hangular.hangular.utils.HangulVokal
import com.hangular.hangular.utils.ViewModelFactory

class MainActivity : AppCompatActivity() {

    val mFragmentManager = supportFragmentManager
    val menuBelajar = MenuBelajarFragment()
    val fragment = mFragmentManager.findFragmentByTag(MenuBelajarFragment::class.java.simpleName)
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        viewModel = obtainViewModel(this)

        viewModel.getHangul().observe(this,{
            if (it.isEmpty()) {
                viewModel.insertHangul(HangulVokal.generateVokal(),HangulKonsonan.generateKonsonan())
            }
        })

        viewModel.getBaca().observe(this, {
            if (it.isEmpty()) {
                viewModel.insertCara(HangulCaraBaca.generateBaca())
            }
        })

        if (fragment !is MenuUtamaFragment) {
            mFragmentManager
                .beginTransaction()
                .add(R.id.menu_utama,menuBelajar, MenuBelajarFragment::class.java.simpleName)
                .commit()
        }
    }

    fun obtainViewModel (activity: AppCompatActivity) : MainViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity,factory).get(MainViewModel::class.java)
    }
}