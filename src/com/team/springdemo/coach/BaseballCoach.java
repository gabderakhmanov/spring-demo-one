package com.team.springdemo.coach;

import com.team.springdemo.service.FortuneService;
import com.team.springdemo.service.TimeTableService;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneFortuneService;
    private TimeTableService timeTableService;

    // define a private field for dependency injection
    public BaseballCoach(FortuneService theFortuneFortuneService, TimeTableService theTimeTableService){
        fortuneFortuneService = theFortuneFortuneService;
        timeTableService = theTimeTableService;
    }

    @Override
    public String getDailyWorkout() {
        return "Batting practice";
    }

    // use the dependency
    @Override
    public String getFortune() {
        return fortuneFortuneService.getFortune();
    }

    @Override
    public String getTimeTable() {
        return timeTableService.getTimeTable();
    }


}
