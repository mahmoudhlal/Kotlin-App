package com.mahmoud.myfirstkotlinapp.NewsPackage.ListItems

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mahmoud.myfirstkotlinapp.Models.NewsResponse.ArticlesItem
import com.mahmoud.myfirstkotlinapp.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_news.view.*

class NewsAdapter : PagedListAdapter<ArticlesItem,NewsAdapter.NewsViewHolder>(DIFF_CALL_BACK) {

    private var context: Context?=null
    //private var newsList:ArrayList<ArticlesItem> ?= ArrayList()

    companion object {
        private val DIFF_CALL_BACK = object : DiffUtil.ItemCallback<ArticlesItem>() {
            override fun areItemsTheSame(oldItem: ArticlesItem, newItem: ArticlesItem): Boolean =
                oldItem.title == newItem.title

            override fun areContentsTheSame(oldItem: ArticlesItem, newItem: ArticlesItem): Boolean =
                oldItem == newItem
        }
    }

    /*fun setNewsList(newsList:List<ArticlesItem>){
        this.newsList!!.addAll(newsList)
        notifyDataSetChanged()
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        context=parent.context
        return NewsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.view_news,
                parent,
                false
            )
        )
    }



    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val item = getItem(position)
        if (item != null) {
            holder.txtTitle.text = item.title
            holder.txtDate.text = item.publishedAt
            if (item.urlToImage != null) {
                Picasso.get().load(item.urlToImage)
                    .placeholder(context!!.resources.getDrawable(R.drawable.ic_launcher_background))
                    .into(holder.image)
            }
        }
    }

    class NewsViewHolder(view: View) :  RecyclerView.ViewHolder(view){
        val txtTitle = view.txtTitle
        val txtDate = view.txtDate
        val image = view.image
    }


}