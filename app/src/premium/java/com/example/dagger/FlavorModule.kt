package com.example.dagger

import com.example.dagger.di.LiveFeedbackModule
import com.example.dagger.di.Premium
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by LKW on 25/6/2017.
 */

@Module(includes = arrayOf(LiveFeedbackModule::class))
class FlavorModule {
    @Singleton @Provides
    fun provideLiveFeedbackManager(@Premium manager: LiveFeedbackManager): LiveFeedbackManager {
        return manager
    }
}