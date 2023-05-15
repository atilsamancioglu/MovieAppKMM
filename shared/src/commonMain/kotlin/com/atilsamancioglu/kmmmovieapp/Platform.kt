package com.atilsamancioglu.kmmmovieapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform