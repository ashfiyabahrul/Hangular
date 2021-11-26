package com.hangular.hangular.ui.detail

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hangular.hangular.data.local.HangulRepository
import com.hangular.hangular.data.model.Hangul

class DetailViewModel (application: Application) : ViewModel() {

    val hangulRepository = HangulRepository(application)

    fun getDetail (id : Int) : LiveData<Hangul> = hangulRepository.getDetail(id)

}