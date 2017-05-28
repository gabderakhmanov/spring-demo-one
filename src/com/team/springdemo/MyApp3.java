package com.team.springdemo;

import com.team.springdemo.teacher.ChemistryTeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxim on 5/27/17.
 */
public class MyApp3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        ChemistryTeacher teacher = context.getBean(ChemistryTeacher.class);
        teacher.teachChemistry();

        context.close();

    }
}
