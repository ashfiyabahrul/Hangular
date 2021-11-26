package com.hangular.hangular.data.model

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "baca")
data class Baca (
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    val id : Int = 0,
    @ColumnInfo(name = "nama")
    val nama : String,
    @ColumnInfo(name = "gambar")
    val gambar : Int,
    @ColumnInfo(name = "awal")
    val awal : String,
    @ColumnInfo(name = "tengah")
    val tengah : String,
    @ColumnInfo(name = "akhir")
    val akhir : String
        ) : Parcelable