package com.atilsamancioglu.kmmmovieapp.domain.repository

import com.atilsamancioglu.kmmmovieapp.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}