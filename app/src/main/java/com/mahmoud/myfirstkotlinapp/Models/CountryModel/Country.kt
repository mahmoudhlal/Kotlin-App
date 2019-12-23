package com.mahmoud.myfirstkotlinapp.Models.CountryModel

class Country {
    private var name: String? = null
    private var code: String? = null

    constructor(){}
    constructor(name: String, code: String){
        this.name = name
        this.code = code
    }


    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getCode(): String? {
        return code
    }

    fun setCode(code: String) {
        this.code = code
    }

}