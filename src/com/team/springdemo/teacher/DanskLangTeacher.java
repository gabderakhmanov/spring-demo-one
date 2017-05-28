package com.team.springdemo.teacher;

import com.team.springdemo.learning.DanskLearning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by maxim on 5/28/17.
 */
@Component
public class DanskLangTeacher {

    private DanskLearning danskLearning;

    @Autowired
    public DanskLangTeacher(DanskLearning danskLearning) {
        this.danskLearning = danskLearning;
    }

    public String getDanskLang(){
        return danskLearning.getDanskLangRules();
    }
}
