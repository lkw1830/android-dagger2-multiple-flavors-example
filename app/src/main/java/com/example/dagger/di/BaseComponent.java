package com.example.dagger.di;

/**
 * Created by LKW on 24/6/2017.
 */

import com.example.dagger.DaggerApplication;

/***
 * inject methods for registration
 * only for classes that live within main source
 */
public interface BaseComponent {
    void inject(DaggerApplication target);
}
