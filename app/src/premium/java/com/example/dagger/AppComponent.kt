package com.example.dagger

import android.app.Application
import com.example.dagger.di.NetworkModule
import com.example.dagger.di.Premium
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by LKW on 25/6/2017.
 */

@Premium
@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        NetworkModule::class,
        FlavorModule::class,
        PremiumActivityModule::class
))
interface AppComponent: FlavorComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}