package com.mahmoud.myfirstkotlinapp.Models.NewsResponse

import com.google.gson.annotations.SerializedName

class NewsResponse {
    @SerializedName("totalResults")
    private var totalResults: Int = 0

    @SerializedName("message")
    private var message: String? = null

    @SerializedName("articles")
    private var articles: List<ArticlesItem>? = null

    @SerializedName("status")
    private var status: String? = null

    fun setTotalResults(totalResults: Int) {
        this.totalResults = totalResults
    }

    fun getTotalResults(): Int {
        return totalResults
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessage(): String? {
        return message
    }

    fun setArticles(articles: List<ArticlesItem>) {
        this.articles = articles
    }

    fun getArticles(): List<ArticlesItem>? {
        return articles
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getStatus(): String? {
        return status
    }

}