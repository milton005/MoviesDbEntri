package com.sheraz.listrepos.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.moviedb_entri.models.ResultsItem


class MovieDiffCallback : DiffUtil.ItemCallback<ResultsItem>() {

    override fun areContentsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean {
        return oldItem == newItem
    }

    override fun areItemsTheSame(oldItem: ResultsItem, newItem: ResultsItem): Boolean {
        return oldItem.id == newItem.id
    }

}