package com.mahmoud.myfirstkotlinapp.ViewModel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mahmoud.myfirstkotlinapp.Repository.NewsRepository

class NewsViewModelFactory
    (private var newsRepository: NewsRepository)
    : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}