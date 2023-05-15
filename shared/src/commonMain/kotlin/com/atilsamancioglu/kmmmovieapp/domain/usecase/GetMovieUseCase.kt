package com.atilsamancioglu.kmmmovieapp.domain.usecase

import com.atilsamancioglu.kmmmovieapp.domain.repository.MovieRepository
import com.atilsamancioglu.kmmmovieapp.domain.model.Movie
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetMovieUseCase: KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(movieId: Int): Movie {
        return repository.getMovie(movieId = movieId)
    }
}