package com.team.springdemo.teacher;

import org.springframework.stereotype.Component;

/**
 * Created by maxim on 5/28/17.
 */

@Component("myFrenchTeacher")
public class FrenchLangTeacher {

    public String getSomeNewWords(){
        return "New French Words";
    }

}
