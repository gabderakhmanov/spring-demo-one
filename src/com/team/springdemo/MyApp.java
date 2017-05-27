package com.team.springdemo;

import com.team.springdemo.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method from dependency
        System.out.println(theCoach.getFortune());
        System.out.println(theCoach.getTimeTable());

        // close the context
        context.close();
    }

}
