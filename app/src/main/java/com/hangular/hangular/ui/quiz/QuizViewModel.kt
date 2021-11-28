package com.hangular.hangular.ui.quiz


import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hangular.hangular.data.local.HangulRepository
import com.hangular.hangular.data.model.Hangul

class QuizViewModel (application: Application) : ViewModel() {

    val hangulRepository = HangulRepository(application)

    fun getByName (nama : String) : LiveData<Hangul> = hangulRepository.getByName(nama)

}