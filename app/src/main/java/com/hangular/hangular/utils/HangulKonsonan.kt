package com.hangular.hangular.utils

import com.hangular.hangular.R
import com.hangular.hangular.data.model.Hangul

object HangulKonsonan {

    fun generateKonsonan() : List<Hangul> {

        val hangulKonsonan : ArrayList<Hangul> = arrayListOf()

        hangulKonsonan.add(
            Hangul(
                nama = "KA or GA",
                gambar = R.drawable.k_or_g,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "BA or PA",
                gambar = R.drawable.b_or_p,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "C or JJ",
                gambar = R.drawable.c_or_jj,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "CHA",
                gambar = R.drawable.ch,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "DA",
                gambar = R.drawable.d,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "HA",
                gambar = R.drawable.h,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "JA",
                gambar = R.drawable.j,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "KK",
                gambar = R.drawable.k_or_kk,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "QA or KHA",
                gambar = R.drawable.kh_or_q,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "LA",
                gambar = R.drawable.l,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "MA",
                gambar = R.drawable.m,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "N or NG",
                gambar = R.drawable.n_or_ng,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "PHA",
                gambar = R.drawable.ph,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "PP",
                gambar = R.drawable.pp_or_bb,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "R or LL",
                gambar = R.drawable.r_or_l,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "S",
                gambar = R.drawable.s,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "SS",
                gambar = R.drawable.ss,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "TT",
                gambar = R.drawable.t_or_tt,
                suara = "",
                tipe = 2
            )
        )
        hangulKonsonan.add(
            Hangul(
                nama = "T or TH",
                gambar = R.drawable.th_or_t,
                suara = "",
                tipe = 2
            )
        )

        return hangulKonsonan
    }
}