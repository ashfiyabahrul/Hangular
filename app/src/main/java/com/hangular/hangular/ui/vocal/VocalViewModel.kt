package com.hangular.hangular.ui.vocal

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hangular.hangular.data.local.HangulRepository
import com.hangular.hangular.data.model.Hangul

class VocalViewModel (application: Application) : ViewModel() {

    private val mHangulRepository = HangulRepository(application)

    fun getHangulVocal() : LiveData<List<Hangul>> = mHangulRepository.getHangulVocal()

    fun insertHangulVocal(hangulVocal : List<Hangul>) {
        mHangulRepository.insertHangulVocal(hangulVocal)
    }
}