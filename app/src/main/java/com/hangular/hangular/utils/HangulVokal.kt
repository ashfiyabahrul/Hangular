package com.hangular.hangular.utils

import com.hangular.hangular.R
import com.hangular.hangular.data.model.Hangul

object HangulVokal {

    fun generateVokal () : List<Hangul> {

        val hangulVokal : ArrayList<Hangul> = arrayListOf()

        hangulVokal.add(
            Hangul(
                nama = "A",
                gambar = R.drawable.a,
                suara = R.raw.a,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "AE",
                gambar = R.drawable.ae,
                suara = R.raw.ae,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "E",
                gambar = R.drawable.e,
                suara = R.raw.e,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "EO",
                gambar = R.drawable.eo,
                suara = R.raw.o,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "EU",
                gambar = R.drawable.eu,
                suara = R.raw.eu,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "EUI",
                gambar = R.drawable.eui,
                suara = R.raw.eui,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "I",
                gambar = R.drawable.i,
                suara = R.raw.i,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "O",
                gambar = R.drawable.o,
                suara = R.raw.ou,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "OI",
                gambar = R.drawable.oi,
                suara = R.raw.oe,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "U",
                gambar = R.drawable.u,
                suara = R.raw.u,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "WA",
                gambar = R.drawable.wa,
                suara = R.raw.wa,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "WAE",
                gambar = R.drawable.wae,
                suara = R.raw.wae,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "WE or AE",
                gambar = R.drawable.we_or_ue,
                suara = R.raw.we,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "WEO or WO",
                gambar = R.drawable.weo_or_wo,
                suara = R.raw.wo,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "WI",
                gambar = R.drawable.wi_or_ui,
                suara = R.raw.wi,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "YA",
                gambar = R.drawable.ya,
                suara = R.raw.ya,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "YAE",
                gambar = R.drawable.yae,
                suara = R.raw.yae,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "YE",
                gambar = R.drawable.ye,
                suara = R.raw.ye,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "YEO",
                gambar = R.drawable.yeo,
                suara = R.raw.yo,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "YO",
                gambar = R.drawable.yo,
                suara = R.raw.you,
                tulis = 0,
                tipe = 1
            )
        )
        hangulVokal.add(
            Hangul(
                nama = "YU",
                gambar = R.drawable.yu,
                suara = R.raw.yu,
                tulis = 0,
                tipe = 1
            )
        )

        return hangulVokal
    }
}