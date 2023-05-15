package com.atilsamancioglu.kmmmovieapp.di

import com.atilsamancioglu.kmmmovieapp.data.remote.MovieService
import com.atilsamancioglu.kmmmovieapp.data.remote.RemoteDataSource
import com.atilsamancioglu.kmmmovieapp.data.repository.MovieRepositoryImpl
import com.atilsamancioglu.kmmmovieapp.domain.repository.MovieRepository
import com.atilsamancioglu.kmmmovieapp.domain.usecase.GetMovieUseCase
import com.atilsamancioglu.kmmmovieapp.domain.usecase.GetMoviesUseCase
import com.atilsamancioglu.kmmmovieapp.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












