package com.team.springdemo.teacher;

import com.team.springdemo.learning.LangLearning;

/**
 * Created by maxim on 5/27/17.
 */
public class LangTeacher {

    private LangLearning langLearning;

    private String langTeacherEmail;

    public void setLangTeacherEmail(String langTeacherEmail) {
        this.langTeacherEmail = langTeacherEmail;
    }

    public void setLangLearning(LangLearning langLearning) {
        this.langLearning = langLearning;
    }

    public String getKnowledge(){
        return this.langLearning.getLangKnwldg();
    }
    public String getLangTeacherEmail(){
        return langTeacherEmail;
    }
}
