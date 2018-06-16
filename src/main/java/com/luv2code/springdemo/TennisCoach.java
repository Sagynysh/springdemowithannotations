package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by asus on 2/13/2018.
 */

@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println(">>TennisCoach: inside default constructor");
    }
//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//        fortuneService = theFortuneService;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDAilyFortune() {
        return fortuneService.getFortune();
    }

    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println(">>TennisCoach: inside the setFortuneService() method");
        fortuneService = theFortuneService;

    }
}
