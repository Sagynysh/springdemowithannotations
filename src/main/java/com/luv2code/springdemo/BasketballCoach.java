package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/16/2018.
 */
@Component
public class BasketballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Basketball playing";
    }

    @Override
    public String getDAilyFortune() {
        return null;
    }
}
