package com.example.dagger.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by LKW on 24/6/2017.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Free {
}
