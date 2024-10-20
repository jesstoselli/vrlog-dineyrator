package com.jessto.dineyrator.android

import android.app.Application
import com.jessto.dineyrator.android.di.viewModelsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DineyratorApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
//        val modules = sharedKoinModules + viewModelsModule + databaseModule
        val modules = viewModelsModule

        startKoin {
            androidContext(this@DineyratorApplication)
            modules(modules)
        }
    }

}