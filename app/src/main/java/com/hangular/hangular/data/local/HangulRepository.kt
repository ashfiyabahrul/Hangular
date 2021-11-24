package com.hangular.hangular.data.local

import android.app.Application
import androidx.lifecycle.LiveData
import com.hangular.hangular.data.model.Hangul
import com.hangular.hangular.utils.HangulKonsonan
import com.hangular.hangular.utils.HangulVokal

class HangulRepository (application: Application) {

    private val mHangulDao : HangulDao

    init {
        val database = HangulDatabase.getDatabase(application)
        mHangulDao = database.hangulDao()
    }

    fun getHangulVocal () : LiveData<List<Hangul>> = mHangulDao.getHangulVocal()

    fun getHangulKonsonan() : LiveData<List<Hangul>> = mHangulDao.getHangulKonsonan()

    fun insertHangulVocal(hangulVocal : List<Hangul>) {
        mHangulDao.insertHangul(hangulVocal)
    }

    fun insertHangulKonsonan() {
        mHangulDao.insertHangul(HangulKonsonan.generateKonsonan())
    }
}