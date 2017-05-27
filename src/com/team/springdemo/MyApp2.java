package com.team.springdemo;

import com.team.springdemo.coach.Coach;
import com.team.springdemo.coach.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxim on 5/27/17.
 */
public class MyApp2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(theCoach.getFortune());
        context.close();
    }

}
