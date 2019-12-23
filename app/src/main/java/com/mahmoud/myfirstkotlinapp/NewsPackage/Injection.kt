package com.mahmoud.myfirstkotlinapp.NewsPackage

import android.content.Context
import com.mahmoud.myfirstkotlinapp.Local.NewsDao
import com.mahmoud.myfirstkotlinapp.Local.NewsDataBase
import com.mahmoud.myfirstkotlinapp.Remote.ApiUtils
import com.mahmoud.myfirstkotlinapp.Remote.NewsService
import com.mahmoud.myfirstkotlinapp.Repository.NewsRepository
import com.mahmoud.myfirstkotlinapp.Repository.NewsRepositoryImpl

class Injection {

    companion object{
        fun provideMovieRepository(context : Context):NewsRepository{
            return NewsRepositoryImpl(provideAPIService(),provideOrderDao(context))
        }

        private fun provideAPIService(): NewsService {
            return ApiUtils.getNewsService()
        }

        private fun provideOrderDao(context: Context): NewsDao {
            return NewsDataBase.getInstance(context)!!.newsDao()
        }
    }

}