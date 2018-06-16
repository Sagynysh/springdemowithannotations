package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by asus on 6/16/2018.
 */
@Component
public class RandomFortuneService implements FortuneService {
    String [] data = {"Beware of the wolf in sheep's clothing","The jounrey is reward","Dilgence is the mother of good luck"};
    private Random random = new Random();
    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
