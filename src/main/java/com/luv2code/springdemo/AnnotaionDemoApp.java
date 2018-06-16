package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 2/13/2018.
 */
public class AnnotaionDemoApp {
    public static void main(String[] args) {
        //read spring context file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        //call methid from bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDAilyFortune());
        //close context
        context.close();

    }
}
