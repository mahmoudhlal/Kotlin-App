package com.mahmoud.myfirstkotlinapp.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem
import com.mahmoud.myfirstkotlinapp.Repository.NewsRepository

class NewsViewModel
    (newsRepository : NewsRepository) : ViewModel() {

    private var newsLiveData: LiveData<PagedList<ArticlesItem>> = newsRepository.getNews()

    fun getNews():LiveData<PagedList<ArticlesItem>> {
        return newsLiveData
    }


}