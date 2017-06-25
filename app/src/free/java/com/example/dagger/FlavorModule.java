package com.example.dagger;

import com.example.dagger.di.Free;
import com.example.dagger.di.LiveFeedbackModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by LKW on 24/6/2017.
 */

@Module(includes = LiveFeedbackModule.class)
public class FlavorModule {
    private static final String TAG = "FlavorModule";

    @Singleton
    @Provides
    LiveFeedbackManager provideLiveFeedbackManager(@Free LiveFeedbackManager manager) {
        return manager;
    }
}
