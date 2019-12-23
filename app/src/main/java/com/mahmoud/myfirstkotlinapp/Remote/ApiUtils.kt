package com.mahmoud.myfirstkotlinapp.Remote

class ApiUtils {

    companion object {

        fun getNewsService(): NewsService {
            val retrofitClient = RetrofitClient()
            return retrofitClient.getClient()!!.create(NewsService::class.java)
        }

    }
}