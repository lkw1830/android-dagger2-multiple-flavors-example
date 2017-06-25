package com.example.dagger.di;

import com.example.dagger.FreeLiveFeedbackManager;
import com.example.dagger.LiveFeedbackManager;
import com.example.dagger.PremiumLiveFeedbackManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by LKW on 25/6/2017.
 */

@Module
public class LiveFeedbackModule {

    @Provides
    @Singleton
    @Premium
    public LiveFeedbackManager providesPremiumLiveFeedbackManager() {
        return new PremiumLiveFeedbackManager();
    }

    @Provides
    @Singleton
    @Free
    public LiveFeedbackManager providesFreeLiveFeedbackManager() {
        return new FreeLiveFeedbackManager();
    }
}
