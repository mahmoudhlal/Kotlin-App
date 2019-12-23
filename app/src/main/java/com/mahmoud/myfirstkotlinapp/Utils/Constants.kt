package com.mahmoud.myfirstkotlinapp.Utils

import com.mahmoud.myfirstkotlinapp.Models.CountryModel.Country
import java.util.ArrayList

class Constants
/**
 * fill static country list
 */() {

    val API_KEY = "111f0795b6d845b9ab38a833168c3be4"
    var COUNTRY_LIST: MutableList<Country> = ArrayList()

    companion object {
        private var constants: Constants? = null
        @Synchronized
        fun getInstance(): Constants? {
            if (constants == null) {
                constants = Constants()
            }
            return constants
        }
    }
    init {
        COUNTRY_LIST.add(Country("Select Country", "empty"))
        COUNTRY_LIST.add(Country("United Arab Emirates", "ae"))
        COUNTRY_LIST.add(Country("Argentina", "ar"))
        COUNTRY_LIST.add(Country("Austria", "at"))
        COUNTRY_LIST.add(Country("Belgium", "be"))
        COUNTRY_LIST.add(Country("Bulgaria", "bg"))
        COUNTRY_LIST.add(Country("Brazil", "br"))
        COUNTRY_LIST.add(Country("Canada", "ca"))
        COUNTRY_LIST.add(Country("Switzerland", "ch"))
        COUNTRY_LIST.add(Country("China", "cn"))
        COUNTRY_LIST.add(Country("Colombia", "co"))
        COUNTRY_LIST.add(Country("Cuba", "cu"))
        COUNTRY_LIST.add(Country("Czech Republic", "cz"))
        COUNTRY_LIST.add(Country("Germany", "de"))
        COUNTRY_LIST.add(Country("Egypt", "eg"))
        COUNTRY_LIST.add(Country("France", "fr"))
        COUNTRY_LIST.add(Country("United Kingdom", "gb"))
        COUNTRY_LIST.add(Country("Greece", "gr"))
        COUNTRY_LIST.add(Country("Hong Kong", "hk"))
        COUNTRY_LIST.add(Country("Hungary", "hu"))
        COUNTRY_LIST.add(Country("Indonesia", "id"))
        COUNTRY_LIST.add(Country("Ireland", "ie"))
        COUNTRY_LIST.add(Country("India", "in"))
        COUNTRY_LIST.add(Country("Italy", "it"))
        COUNTRY_LIST.add(Country("Japan", "jp"))
        COUNTRY_LIST.add(Country("Korea (Republic of)", "kr"))
        COUNTRY_LIST.add(Country("Lithuania", "lt"))
        COUNTRY_LIST.add(Country("Latvia", "lv"))
        COUNTRY_LIST.add(Country("Morocco", "ma"))
        COUNTRY_LIST.add(Country("Mexico", "mx"))
        COUNTRY_LIST.add(Country("Malaysia", "my"))
        COUNTRY_LIST.add(Country("Nigeria", "ng"))
        COUNTRY_LIST.add(Country("Netherlands", "nl"))
        COUNTRY_LIST.add(Country("Norway", "no"))
        COUNTRY_LIST.add(Country("New Zealand", "nz"))
        COUNTRY_LIST.add(Country("Philippines", "ph"))
        COUNTRY_LIST.add(Country("Poland", "pl"))
        COUNTRY_LIST.add(Country("Portugal", "pt"))
        COUNTRY_LIST.add(Country("Romania", "ro"))
        COUNTRY_LIST.add(Country("Serbia", "rs"))
        COUNTRY_LIST.add(Country("Russian Federation", "ru"))
        COUNTRY_LIST.add(Country("Saudi Arabia", "sa"))
        COUNTRY_LIST.add(Country("Sweden", "se"))
        COUNTRY_LIST.add(Country("Singapore", "sg"))
        COUNTRY_LIST.add(Country("Slovenia", "si"))
        COUNTRY_LIST.add(Country("Slovakia", "sk"))
        COUNTRY_LIST.add(Country("Thailand", "th"))
        COUNTRY_LIST.add(Country("Turkey", "tr"))
        COUNTRY_LIST.add(Country("Taiwan", "rw"))
        COUNTRY_LIST.add(Country("Ukraine", "ua"))
        COUNTRY_LIST.add(Country("United States of America", "us"))
        COUNTRY_LIST.add(Country("Venezuela (Bolivarian Republic of)", "ve"))
        COUNTRY_LIST.add(Country("South Africa", "za"))
    }

}