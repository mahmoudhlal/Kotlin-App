package com.mahmoud.myfirstkotlinapp.CallBack

import android.util.Log
import androidx.paging.PagedList
import com.mahmoud.myfirstkotlinapp.Local.NewsDao
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.NewsResponse
import com.mahmoud.myfirstkotlinapp.Remote.NewsService
import com.mahmoud.myfirstkotlinapp.Utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class NewsBoundaryCallback(private var newsService: NewsService?, cache: NewsDao) :
    PagedList.BoundaryCallback<ArticlesItem>() {

    var lastRequestedPage:Int = 1
    var isRequestInProgress:Boolean = false
    var cache : NewsDao ?= cache
    var executor: Executor = Executors.newSingleThreadExecutor()


    private fun requestAndSaveNews(){
        if (isRequestInProgress) return

        isRequestInProgress = true

        Log.d("OOO" ,"Page $lastRequestedPage")
        newsService!!.
            getNews(Constants.getInstance()!!.API_KEY,
                "eg" ,
                lastRequestedPage)
            .enqueue(object :  Callback<NewsResponse> {

                override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                    isRequestInProgress=false
                    if (response.isSuccessful){
                        if (response.body()!!.getStatus().equals("ok")){
                            lastRequestedPage++

                            executor.execute {
                                if (lastRequestedPage == 1)
                                    cache!!.deleteAll()

                                Log.d("OOO" ,"Size  ${response.body()!!.getArticles()!!.size.toString()}")
                                response.body()!!.getArticles()?.let { cache!!.insert(it) }
                            }
                        }
                    }
                }


                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    //SharedClass.getInstance()
                    isRequestInProgress=false
                }

            })
    }


    override fun onZeroItemsLoaded() {
        requestAndSaveNews()
    }

    override fun onItemAtEndLoaded(itemAtEnd: ArticlesItem) {
        Log.d("OOO" , "onItemAtEndLoaded : $lastRequestedPage")
        requestAndSaveNews()
    }



}

