package com.team.springdemo.coach;

import com.team.springdemo.coach.Coach;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 5K";
    }

    @Override
    public String getFortune() {
        return null;
    }

    @Override
    public String getTimeTable() {
        return null;
    }

}
