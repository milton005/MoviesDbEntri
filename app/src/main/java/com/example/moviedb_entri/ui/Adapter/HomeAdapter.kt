package com.example.moviedb_entri.ui.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.moviedb_entri.models.ResultsItem
import com.example.moviedb_entri.R
import com.example.moviedb_entri.Util.Constants


import com.sheraz.listrepos.utils.MovieDiffCallback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_item_raw.view.*
import javax.inject.Inject


class HomeAdapter @Inject constructor(

    private val mPicasso: Picasso
) : PagedListAdapter<ResultsItem, HomeAdapter.ViewHolder>(MovieDiffCallback()) {


    private var mListener: DetailListener? = null



    override fun onCreateViewHolder(viewGroup: ViewGroup, view_type: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.movie_item_raw, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        viewHolder.bind(getItem(position))
    }

    fun setListener(listener: DetailListener) {

        mListener = listener
    }

    inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        fun bind(movieItem: ResultsItem?) {

            if (movieItem == null) return

            setUpViews(movieItem)
            handleClicks(movieItem)

        }

        private fun setUpViews(item: ResultsItem?) {

            if (itemView.tag == null) {
                itemView.tag = item
            }


            item?.posterPath?.let {
              val url=Constants.picBAseURl+it
                mPicasso.load(url)
                    .into(itemView.imageView)
            }
            item?.title?.let {
                itemView.title.text=it
            }


        }

        private fun handleClicks(movieItem: ResultsItem?) {

           itemView.setOnClickListener{
               mListener?.DetailListener(movieItem)
           }
        }

    }
    interface DetailListener{
        fun DetailListener(item: ResultsItem?)
    }



    companion object {
        private val TAG = HomeAdapter::class.java.simpleName
    }
}
