package com.atilsamancioglu.kmmmovieapp.data.repository

import com.atilsamancioglu.kmmmovieapp.data.remote.RemoteDataSource
import com.atilsamancioglu.kmmmovieapp.data.util.toMovie
import com.atilsamancioglu.kmmmovieapp.domain.model.Movie
import com.atilsamancioglu.kmmmovieapp.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}