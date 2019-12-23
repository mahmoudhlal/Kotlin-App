package com.mahmoud.myfirstkotlinapp.Repository

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.mahmoud.myfirstkotlinapp.CallBack.NewsBoundaryCallback
import com.mahmoud.myfirstkotlinapp.Local.NewsDao
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem
import com.mahmoud.myfirstkotlinapp.Remote.NewsService

class NewsRepositoryImpl(newsService: NewsService, private var cache: NewsDao) : NewsRepository {

    private var PAGE_SIZE:Int = 20
    private var newsService : NewsService ?= newsService

    override fun getNews(): LiveData<PagedList<ArticlesItem>> {
        val newsFactory : DataSource.Factory<Int, ArticlesItem> = cache.getMovies()
        val newsBoundaryCallback  = NewsBoundaryCallback(newsService, cache)
        val newsList : LiveData<PagedList<ArticlesItem>> = LivePagedListBuilder(newsFactory, PAGE_SIZE)
            .setBoundaryCallback(newsBoundaryCallback)
            .build()
        return newsList
    }
}