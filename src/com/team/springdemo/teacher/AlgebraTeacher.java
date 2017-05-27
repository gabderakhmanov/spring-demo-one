package com.team.springdemo.teacher;

import com.team.springdemo.learning.AlgebraLearning;
import com.team.springdemo.service.FortuneService;

/**
 * Created by maxim on 5/27/17.
 */
public class AlgebraTeacher {

    private AlgebraLearning algebraLearning;

    public AlgebraTeacher(AlgebraLearning theAlgebraLearning){
        this.algebraLearning = theAlgebraLearning;
    }

    public String getKnowledge(){
        return algebraLearning.getAlgebraKnowledge();
    }
}
