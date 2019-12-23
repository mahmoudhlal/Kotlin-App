package com.mahmoud.myfirstkotlinapp.Repository

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem

interface NewsRepository {
     fun getNews(): LiveData<PagedList<ArticlesItem>>
}