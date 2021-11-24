package com.hangular.hangular.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hangular.hangular.data.model.Hangul

@Database(entities = [Hangul::class], version = 1)
abstract class HangulDatabase : RoomDatabase() {

    abstract fun hangulDao() : HangulDao

    companion object {
        @Volatile
        private var INSTANCE : HangulDatabase? = null

        @JvmStatic
        fun getDatabase (context: Context) : HangulDatabase {
            if (INSTANCE == null) {
                synchronized(HangulDatabase::class.java){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                    HangulDatabase::class.java,"hangul_database")
                        .build()
                }
            }
            return INSTANCE as HangulDatabase
        }
    }

}