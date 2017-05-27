package com.team.springdemo.teacher;

import com.team.springdemo.learning.LangLearning;

/**
 * Created by maxim on 5/27/17.
 */
public class LangTeacher {

    private LangLearning langLearning;

    public void setLangLearning(LangLearning langLearning) {
        this.langLearning = langLearning;
    }

    public String getKnowledge(){
        return this.langLearning.getLangKnwldg();
    }
}
