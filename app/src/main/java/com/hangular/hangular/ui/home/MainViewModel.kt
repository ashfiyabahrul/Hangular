package com.hangular.hangular.ui.home

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hangular.hangular.data.local.HangulRepository
import com.hangular.hangular.data.model.Hangul

class MainViewModel (application: Application) : ViewModel() {

    val hangulRepository = HangulRepository(application)

    fun getHangul() : LiveData<List<Hangul>> = hangulRepository.getHangul()

    fun insertHangul(hangulVocal : List<Hangul>, hangulKonsonan : List<Hangul>) {
        hangulRepository.insertHangulVocal(hangulVocal)
        hangulRepository.insertHangulKonsonan(hangulKonsonan)
    }
}