package com.example.dagger;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by LKW on 25/6/2017.
 */

@Module
public abstract class PremiumActivityModule {
    @ContributesAndroidInjector
    abstract PremiumActivity premiumActivity();
}
