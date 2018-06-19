package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by asus on 2/13/2018.
 */

@Component
public class TennisCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
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

    @PostConstruct
    public void doMyCleanupStuff(){
        System.out.println("Inside do my startupStuff");
    }

    @PreDestroy
    public void doMyEndupStuff(){
        System.out.println("Inside do my endup stuff");
    }

}
