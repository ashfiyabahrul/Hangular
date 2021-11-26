package com.hangular.hangular.ui.hangul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.hangular.hangular.data.model.Hangul
import com.hangular.hangular.databinding.ActivityHangulVocalBinding
import com.hangular.hangular.utils.ViewModelFactory

class HangulVocalActivity : AppCompatActivity() {

    companion object {
        const val HANGUL = "HANGUL"
    }

    lateinit var binding: ActivityHangulVocalBinding
    lateinit var viewModel: VocalViewModel

    val hangul : ArrayList<Hangul> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHangulVocalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = obtainViewModel(this)

        if (intent.getIntExtra(HANGUL,0) == 1){
            supportActionBar?.title = "VOCAL"
            viewModel.getHangulVocal().observe(this, {listVocal ->
                hangul.addAll(listVocal)
            })
        }
        else if (intent.getIntExtra(HANGUL,0) == 2){
            supportActionBar?.title = "KONSONAN"
            viewModel.getHangulKonsonan().observe(this, {listKonsonan ->
                hangul.addAll(listKonsonan)
            })
        }

        binding.rvVocal.layoutManager = GridLayoutManager(this,4)
        val adapter = VocalRecycleAdapter(hangul)
        binding.rvVocal.adapter = adapter

    }

    fun obtainViewModel (activity: AppCompatActivity) : VocalViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity,factory).get(VocalViewModel::class.java)
    }
}