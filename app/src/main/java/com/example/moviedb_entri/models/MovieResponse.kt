package com.example.moviedb_entri.models

import com.example.moviedb_entri.data.local.MovieDbEntity
import com.google.gson.annotations.SerializedName

data class MovieResponse(

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("total_pages")
	val totalPages: Int? = null,

	@field:SerializedName("results")
	val results: List<MovieDbEntity>? = null,

	@field:SerializedName("total_results")
	val totalResults: Int? = null
)


