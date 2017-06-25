package com.example.dagger

import android.app.Application

import com.example.dagger.di.Free
import com.example.dagger.di.NetworkModule

import javax.inject.Singleton

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by LKW on 24/6/2017.
 */

@Free
@Singleton
@Component(modules = arrayOf(AndroidInjectionModule::class, NetworkModule::class, FlavorModule::class, MainActivityModule::class))
interface AppComponent : FlavorComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}
