package com.hangular.hangular.utils

import com.hangular.hangular.R
import com.hangular.hangular.data.model.Baca

object HangulCaraBaca {
    fun generateBaca () : List<Baca> {

        val listBaca : ArrayList<Baca> = arrayListOf()

        listBaca.add(
            Baca(
                nama = "kiyôk",
                gambar = R.drawable.k_or_g,
                awal = "K/G",
                tengah = "G",
                akhir = "K",
            )
        )
        listBaca.add(
            Baca(
                nama = "nieun",
                gambar = R.drawable.n ,
                awal = "N",
                tengah = "N",
                akhir = "N",
            )
        )
        listBaca.add(
            Baca(
                nama = "digeut",
                gambar = R.drawable.d,
                awal = "T/D",
                tengah = "D",
                akhir = "T",
            )
        )
        listBaca.add(
            Baca(
                nama = "rieul",
                gambar = R.drawable.r_or_l,
                awal = "R/L",
                tengah = "R/L",
                akhir = "L",
            )
        )
        listBaca.add(
            Baca(
                nama = "mieum",
                gambar = R.drawable.m,
                awal = "M",
                tengah = "M",
                akhir = "M",
            )
        )
        listBaca.add(
            Baca(
                nama = "bieup",
                gambar = R.drawable.b_or_p,
                awal = "P/B",
                tengah = "B",
                akhir = "P",
            )
        )
        listBaca.add(
            Baca(
                nama = "siot",
                gambar = R.drawable.s,
                awal = "S",
                tengah = "S",
                akhir = "T",
            )
        )
        listBaca.add(
            Baca(
                nama = "ieung",
                gambar = R.drawable.n_or_ng,
                awal = "~",
                tengah = "~",
                akhir = "NG",
            )
        )
        listBaca.add(
            Baca(
                nama = "cieut",
                gambar = R.drawable.j,
                awal = "C/J",
                tengah = "J",
                akhir = "T",
            )
        )
        listBaca.add(
            Baca(
                nama = "chieut",
                gambar = R.drawable.ch,
                awal = "CH",
                tengah = "CH",
                akhir = "T",
            )
        )
        listBaca.add(
            Baca(
                nama = "khieuk",
                gambar = R.drawable.kh_or_q,
                awal = "KH",
                tengah = "KH",
                akhir = "K",
            )
        )
        listBaca.add(
            Baca(
                nama = "thieut",
                gambar = R.drawable.th_or_t,
                awal = "TH",
                tengah = "TH",
                akhir = "T",
            )
        )
        listBaca.add(
            Baca(
                nama = "phieup",
                gambar = R.drawable.ph,
                awal = "PH",
                tengah = "PH",
                akhir = "P",
            )
        )
        listBaca.add(
            Baca(
                nama = "hieut",
                gambar = R.drawable.h,
                awal = "H/~",
                tengah = "H/~",
                akhir = "T/~",
            )
        )


        return listBaca
    }
}