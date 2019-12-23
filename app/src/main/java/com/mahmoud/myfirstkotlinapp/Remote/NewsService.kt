package com.mahmoud.myfirstkotlinapp.Remote

import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.NewsResponse
import com.mahmoud.myfirstkotlinapp.Models.SourcesResponse.SourcesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    @GET("top-headlines")
    fun getNews(
        @Query("apiKey") apiKey: String,
        @Query("country") country: String,
        /*@Query("sources") sources: String,*/
        @Query("page") page: Int
    ): Call<NewsResponse>

    @GET("sources")
    fun getNewsSources(
        @Query("apiKey") apiKey: String
    ): Call<SourcesResponse>


}