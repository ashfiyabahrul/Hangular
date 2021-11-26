package com.hangular.hangular.ui.baca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.hangular.hangular.data.model.Baca
import com.hangular.hangular.databinding.ActivityCaraBacaBinding
import com.hangular.hangular.ui.home.MainViewModel
import com.hangular.hangular.utils.ViewModelFactory

class CaraBacaActivity : AppCompatActivity() {

    lateinit var binding: ActivityCaraBacaBinding
    lateinit var viewModel: CaraBacaViewModel

    val caraBaca : ArrayList<Baca> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCaraBacaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = obtainViewModel(this)

        viewModel.getCara().observe(this, {
            caraBaca.addAll(it)
        })

        binding.rvTabel.layoutManager = LinearLayoutManager(this)
        val adapter = CaraBacaAdapter(caraBaca)
        binding.rvTabel.adapter = adapter
    }

    fun obtainViewModel (activity: AppCompatActivity) : CaraBacaViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity,factory).get(CaraBacaViewModel::class.java)
    }
}