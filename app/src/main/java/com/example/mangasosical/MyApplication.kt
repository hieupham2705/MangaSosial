package com.example.mangasosical

import android.app.Application
import com.example.btl_mxh.di.*
import com.example.mangasosical.ui.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(networkModule, repositoryModule, dataSourceModule, apiModule, viewModelModule,
                sharedPreferencesModule)
        }
    }
}