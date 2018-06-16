package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by asus on 6/16/2018.
 */
@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is lucky day";
    }
}
