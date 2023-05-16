package com.atilsamancioglu.kmmmovieapp.android

import android.app.Application
import com.atilsamancioglu.kmmmovieapp.android.di.appModule
import com.atilsamancioglu.kmmmovieapp.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}