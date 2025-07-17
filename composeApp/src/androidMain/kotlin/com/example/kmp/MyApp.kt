package com.example.kmp

import android.app.Application
import com.example.kmp.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
         initKoin {
            androidContext(this@MyApp)
        }
    }
}