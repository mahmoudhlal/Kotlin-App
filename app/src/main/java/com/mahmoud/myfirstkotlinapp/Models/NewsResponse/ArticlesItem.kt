package com.mahmoud.myfirstkotlinapp.Models.NewsResponse


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "articles_item")
data class ArticlesItem(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "urlToImage") val urlToImage: String?,
    @ColumnInfo(name = "publishedAt") val publishedAt: String?) {

/*
    @SerializedName("author")
    private var author: String? = null
*/

   /* @SerializedName("description")
    private var description: String? = null

    //@SerializedName("source")
    //private var source: Source? = null

    @SerializedName("url")
    private var url: String? = null

    @SerializedName("content")
    private var content: String? = null



    *//*
    fun setAuthor(author: String) {
        this.author = author
    }

    fun getAuthor(): String? {
        return author
    }*//*


    fun setDescription(description: String) {
        this.description = description
    }

    fun getDescription(): String? {
        return description
    }

   *//* fun setSource(source: Source) {
        this.source = source
    }

    fun getSource(): Source? {
        return source
    }*//*



    fun setUrl(url: String) {
        this.url = url
    }

    fun getUrl(): String? {
        return url
    }

    fun setContent(content: String) {
        this.content = content
    }

    fun getContent(): String? {
        return content
    }
*/


}