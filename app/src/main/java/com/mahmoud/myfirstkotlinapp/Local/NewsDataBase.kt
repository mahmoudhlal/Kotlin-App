package com.mahmoud.myfirstkotlinapp.Local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem

@Database(entities = [ArticlesItem::class], version = 3)
abstract class NewsDataBase : RoomDatabase() {

    abstract fun newsDao(): NewsDao

    companion object {

        @Volatile private var INSTANCE: NewsDataBase ?= null

        fun getInstance(context: Context): NewsDataBase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }
        /*fun getInstance(context: Context): NewsDataBase ? {
            if (INSTANCE == null){
                INSTANCE = buildDatabase(context)
            }
            return INSTANCE
        }*/

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                NewsDataBase::class.java, "News.db")
                .fallbackToDestructiveMigration()
                .build()
    }
}