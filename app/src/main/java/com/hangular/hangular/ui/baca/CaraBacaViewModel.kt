package com.hangular.hangular.ui.baca

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.hangular.hangular.data.local.HangulRepository
import com.hangular.hangular.data.model.Baca

class CaraBacaViewModel (application: Application) : ViewModel() {

    val repository : HangulRepository = HangulRepository(application)

    fun getCara() : LiveData<List<Baca>> = repository.getBaca()
}