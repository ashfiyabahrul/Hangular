package com.hangular.hangular.utils

import com.hangular.hangular.R
import com.hangular.hangular.data.model.Hangul

object HangulKonsonan {

    fun generateKonsonan() : List<Hangul> {

        val hangulKonsonan : ArrayList<Hangul> = arrayListOf()

        hangulKonsonan.add(
            Hangul(
                nama = "K or G",
                gambar = R.drawable.k_or_g,
                suara = R.raw.ka,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "B or P",
                gambar = R.drawable.b_or_p,
                suara = R.raw.pa,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "CH",
                gambar = R.drawable.ch,
                suara = R.raw.cha,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "D",
                gambar = R.drawable.d,
                suara = R.raw.ta,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "H",
                gambar = R.drawable.h,
                suara = R.raw.ha,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "J",
                gambar = R.drawable.j,
                suara = R.raw.ca,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "Q or KH",
                gambar = R.drawable.kh_or_q,
                suara = R.raw.kha,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "N",
                gambar = R.drawable.n,
                suara = R.raw.na,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "M",
                gambar = R.drawable.m,
                suara = R.raw.ma,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "~ or NG",
                gambar = R.drawable.n_or_ng,
                suara = R.raw.ang,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "PH",
                gambar = R.drawable.ph,
                suara = R.raw.pha,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "R or L",
                gambar = R.drawable.r_or_l,
                suara = R.raw.ra,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "S",
                gambar = R.drawable.s,
                suara = R.raw.sa,
                tulis = 0,
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "T or TH",
                gambar = R.drawable.th_or_t,
                suara = R.raw.tha,
                tulis = 0,
                tipe = 2
            )
        )

        return hangulKonsonan
    }
}