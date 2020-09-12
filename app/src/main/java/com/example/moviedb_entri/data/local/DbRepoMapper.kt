package com.example.moviedb_entri.data.local


import com.example.moviedb_entri.models.ResultsItem
import javax.inject.Inject


open class DbRepoMapper @Inject constructor() {



    fun fromDb(from: MovieDbEntity) = ResultsItem(
        from.overview,
        from.originalLanguage,
        from.originalTitle,
        from.video,
        from.title,

        from.posterPath,
        from.backdropPath,
        from.releaseDate,
        from.popularity,
        from.voteAverage,
        from.id,
        from.adult,
        from.voteCount
    )



}