package com.example.dagger.di;

import com.example.dagger.BuildConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LKW on 24/6/2017.
 */

@Module @Network
public class NetworkModule {

    @Provides @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://" + BuildConfig.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
