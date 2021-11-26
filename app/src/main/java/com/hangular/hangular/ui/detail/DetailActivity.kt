package com.hangular.hangular.ui.detail

import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.hangular.hangular.databinding.ActivityDetailBinding
import com.hangular.hangular.utils.ViewModelFactory

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_HANGUL = "hangul"
    }

    lateinit var binding: ActivityDetailBinding
    lateinit var viewModel: DetailViewModel

    lateinit var soundPool: SoundPool

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra(EXTRA_HANGUL,0)

        viewModel = obtainViewModel(this)
        soundPool = SoundPool.Builder().setMaxStreams(1).build()

        viewModel.getDetail(id).observe(this,{
            binding.tvName.text = it.nama
            soundPool.load(this,it.suara,1)
            val soundId = 1

            Glide.with(this)
                .load(it.gambar)
                .into(binding.imgDetail)
            if (it.tipe == 1)
                supportActionBar?.title = "Vocal: " + it.nama
            else if (it.tipe == 2)
                supportActionBar?.title = "Konsonan: " + it.nama

            binding.btnPlay.setOnClickListener{
                soundPool.play(soundId,1.0f,1.0f,1,0,1.0f)
            }
        })
    }

    fun obtainViewModel (activity: AppCompatActivity) : DetailViewModel {
        val factory = ViewModelFactory.getInstance(activity.application)
        return ViewModelProvider(activity,factory).get(DetailViewModel::class.java)
    }


}