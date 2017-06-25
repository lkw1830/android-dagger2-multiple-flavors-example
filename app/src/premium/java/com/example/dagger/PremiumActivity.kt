package com.example.dagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.dagger.di.Premium
import dagger.android.AndroidInjection
import retrofit2.Retrofit
import javax.inject.Inject

class PremiumActivity : AppCompatActivity() {

    @Inject @Premium lateinit var manager: LiveFeedbackManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_premium)
        Log.e("Premium", manager.feedback())
    }
}
