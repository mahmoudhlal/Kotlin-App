package com.mahmoud.myfirstkotlinapp.NewsPackage.ListItems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.mahmoud.myfirstkotlinapp.NewsPackage.Injection
import com.mahmoud.myfirstkotlinapp.R
import com.mahmoud.myfirstkotlinapp.ViewModel.NewsViewModel
import com.mahmoud.myfirstkotlinapp.ViewModel.NewsViewModelFactory
import kotlinx.android.synthetic.main.activity_home.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }

    private fun initView(){
        val newsAdapter =  NewsAdapter()
        recycleNews.layoutManager = LinearLayoutManager(this)
        recycleNews.setHasFixedSize(true)
        recycleNews.adapter = newsAdapter
        val newsViewModel:NewsViewModel =
            ViewModelProviders.of(
                this,NewsViewModelFactory(Injection.provideMovieRepository(this)))
                .get(NewsViewModel::class.java)

        newsViewModel.getNews().observe(this , Observer{newsList->
            if (newsList != null) {
                bar.visibility = View.GONE
                newsAdapter.submitList(newsList)
                Toast.makeText(this,newsList.size.toString(),Toast.LENGTH_SHORT).show()
            }
        })


    }

    override fun onClick(view: View?) {
        when(view!!.id){

        }
    }

}
