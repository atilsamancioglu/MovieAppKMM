package com.atilsamancioglu.kmmmovieapp.android.di

import com.atilsamancioglu.kmmmovieapp.android.detail.DetailViewModel
import com.atilsamancioglu.kmmmovieapp.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}