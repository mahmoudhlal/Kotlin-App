package com.mahmoud.myfirstkotlinapp.Local

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(newsList : List<ArticlesItem>)

    @Query("select * from articles_item")
    fun getMovies(): DataSource.Factory<Int, ArticlesItem>

    @Query("DELETE FROM articles_item")
    fun deleteAll()

}