package com.example.moviedb_entri.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil

import com.example.moviedb_entri.models.ResultsItem
import com.example.moviedb_entri.R
import com.example.moviedb_entri.Util.Constants
import com.example.moviedb_entri.databinding.ActivityDetailBinding
import com.example.moviedb_entri.databinding.ActivityMainBinding

import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_detail.*
import javax.inject.Inject
@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {
    @Inject lateinit var mPicasso: Picasso
    var resultsItem:ResultsItem?=null
    private lateinit var activityHomeBinding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding= DataBindingUtil.setContentView(this,R.layout.activity_detail)
        if (intent.hasExtra("item"))
        {
            resultsItem=intent.getParcelableExtra("item")as ResultsItem
            setUi(resultsItem)
        }
    }


    private fun setUi(resultsItem: ResultsItem?) {
        activityHomeBinding.data=resultsItem
        resultsItem?.posterPath?.let {
            val url= Constants.picBAseURl+it
            mPicasso.load(url)
                .into(activityHomeBinding.imageView3)
        }
        imageViewBack?.setOnClickListener{
            onBackPressed()
        }

    }
}