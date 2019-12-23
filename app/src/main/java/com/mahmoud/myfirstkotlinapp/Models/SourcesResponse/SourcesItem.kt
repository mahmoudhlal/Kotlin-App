package com.mahmoud.myfirstkotlinapp.Models.SourcesResponse

import com.google.gson.annotations.SerializedName

class SourcesItem {
    @SerializedName("country")
    private var country: String? = null

    @SerializedName("name")
    private var name: String? = null

    @SerializedName("description")
    private var description: String? = null

    @SerializedName("language")
    private var language: String? = null

    @SerializedName("id")
    private var id: String? = null

    @SerializedName("category")
    private var category: String? = null

    @SerializedName("url")
    private var url: String? = null


    constructor(){}
    constructor(name: String, id: String){
        this.name = name
        this.id = id
    }


    fun setCountry(country: String) {
        this.country = country
    }

    fun getCountry(): String? {
        return country
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getName(): String? {
        return name
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getDescription(): String? {
        return description
    }

    fun setLanguage(language: String) {
        this.language = language
    }

    fun getLanguage(): String? {
        return language
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getId(): String? {
        return id
    }

    fun setCategory(category: String) {
        this.category = category
    }

    fun getCategory(): String? {
        return category
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun getUrl(): String? {
        return url
    }

}