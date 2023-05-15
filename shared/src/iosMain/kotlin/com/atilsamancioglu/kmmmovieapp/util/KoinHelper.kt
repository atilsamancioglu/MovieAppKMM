package com.atilsamancioglu.kmmmovieapp.util

import com.atilsamancioglu.kmmmovieapp.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}