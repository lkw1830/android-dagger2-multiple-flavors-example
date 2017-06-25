package com.example.dagger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import dagger.android.AndroidInjection;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by LKW on 24/6/2017.
 */

public class AppInjector {
    private AppInjector() {
    }

    public static void init(DaggerApplication bikeApp) {
        DaggerAppComponent.builder().application(bikeApp).build().inject(bikeApp);

        bikeApp
                .registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    @Override
                    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                        handleActivity(activity);
                    }

                    @Override
                    public void onActivityStarted(Activity activity) {

                    }

                    @Override
                    public void onActivityResumed(Activity activity) {

                    }

                    @Override
                    public void onActivityPaused(Activity activity) {

                    }

                    @Override
                    public void onActivityStopped(Activity activity) {

                    }

                    @Override
                    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

                    }

                    @Override
                    public void onActivityDestroyed(Activity activity) {

                    }
                });
    }

    private static void handleActivity(Activity activity) {
        if (activity instanceof HasSupportFragmentInjector) {
            AndroidInjection.inject(activity);
        }
    }
}
