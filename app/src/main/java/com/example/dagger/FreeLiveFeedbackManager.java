package com.example.dagger;


/**
 * Created by LKW on 24/6/2017.
 */
public class FreeLiveFeedbackManager implements LiveFeedbackManager {

    @Override
    public String feedback() {
        return "Free LiveFeedback Manager";
    }
}
