package com.example.moviedb_entri.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.moviedb_entri.models.ResultsItem
import com.example.moviedb_entri.R
import com.example.moviedb_entri.ui.Adapter.HomeAdapter
import com.example.moviedb_entri.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

import dagger.hilt.android.AndroidEntryPoint

import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : AppCompatActivity(){


    private val viewModel:HomeViewModel by viewModels()
    private lateinit var activityHomeBinding: ActivityMainBinding
    @Inject lateinit var homeAdapter: HomeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        activityHomeBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        activityHomeBinding.viemodel=viewModel
        initUI()


        subscribeUi()



    }


    private fun initUI() {
        rvMovies.layoutManager = LinearLayoutManager(this)
        rvMovies.adapter = homeAdapter
        homeAdapter.setListener(object :HomeAdapter.DetailListener{
            override fun DetailListener(item: ResultsItem?) {
                val intent= Intent(this@HomeActivity,DetailActivity::class.java)
                item?.let {  intent.putExtra("item",it) }
                startActivity(intent)

            }

        })
    }




    fun subscribeUi() {
        viewModel?.getPagedListAsLiveData()?.observe(this, Observer { pagedList ->

            submitList(pagedList, false)
        })

        viewModel?.getLoadingLiveData()?.observe(this, Observer { isFetchInProgress ->

            handleFetchInProgress(isFetchInProgress)
        })

        viewModel?.getNetworkErrorLiveData()?.observe(this, Observer { exception ->

            handleNetworkError(exception)
        })

    }
    private fun submitList(pagedList: PagedList<ResultsItem>?, isRefreshing: Boolean) {


        homeAdapter.submitList(pagedList)


    }

    private fun handleFetchInProgress(isFetchInProgress: Boolean) {


        viewModel?.setIsLoading(isFetchInProgress)


    }

    private fun handleNetworkError(exception: Exception) {


        Snackbar.make(activityHomeBinding.root, exception.message.toString(), Snackbar.LENGTH_LONG).show()

    }

}