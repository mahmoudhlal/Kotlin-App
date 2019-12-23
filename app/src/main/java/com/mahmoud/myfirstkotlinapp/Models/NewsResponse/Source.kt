package com.mahmoud.myfirstkotlinapp.Models.NewsResponse

import com.google.gson.annotations.SerializedName

class Source {
    @SerializedName("name")
    private var name: String? = null

    @SerializedName("id")
    private var id: String? = null

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String? {
        return name
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getId(): String? {
        return id
    }
}