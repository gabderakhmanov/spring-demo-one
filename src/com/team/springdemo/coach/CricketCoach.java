package com.team.springdemo.coach;

import com.team.springdemo.service.FortuneService;


/**
 * Created by maxim on 5/27/17.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Daily Workout from CricketCoach";
    }

    @Override
    public String getFortune() {
        return "Fortune from CricketCoach"+ fortuneService.getFortune();
    }

    @Override
    public String getTimeTable() {
        return "Time table form CricketCoach";
    }
}
