package com.example.mangasosical

import android.app.Application
import com.example.mangasosical.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(
                networkModule, repositoryModule, dataSourceModule, apiModule, viewModelModule,
                sharedPreferencesModule
            )
        }
    }
}