package com.example.dagger;


/**
 * Created by LKW on 24/6/2017.
 */
public class PremiumLiveFeedbackManager implements LiveFeedbackManager {

    @Override
    public String feedback() {
        return "Premium LiveFeedback Manager";
    }
}
