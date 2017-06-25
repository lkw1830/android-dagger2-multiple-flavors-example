package com.example.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by LKW on 24/6/2017.
 */

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity
}
