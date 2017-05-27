package com.team.springdemo.service;

/**
 * Created by maxim on 5/26/17.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
