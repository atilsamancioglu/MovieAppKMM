package com.atilsamancioglu.kmmmovieapp.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val releaseDate: String
)
