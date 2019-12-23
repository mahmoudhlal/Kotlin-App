package com.mahmoud.myfirstkotlinapp.Models.SourcesResponse

import com.google.gson.annotations.SerializedName

class SourcesResponse {
    @SerializedName("sources")
    private var sources: List<SourcesItem>? = null

    @SerializedName("message")
    private var message: String? = null

    @SerializedName("status")
    private var status: String? = null

    fun setSources(sources: List<SourcesItem>) {
        this.sources = sources
    }

    fun getSources(): List<SourcesItem>? {
        return sources
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getMessage(): String? {
        return message
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getStatus(): String? {
        return status
    }

}