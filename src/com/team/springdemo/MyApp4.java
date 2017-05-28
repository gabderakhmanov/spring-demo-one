package com.team.springdemo;

import com.team.springdemo.teacher.FrenchLangTeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxim on 5/28/17.
 */
public class MyApp4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanAnnotation-applicationContext.xml");

        FrenchLangTeacher theTeacher = context.getBean("myFrenchTeacher", FrenchLangTeacher.class);
        System.out.println(theTeacher.getSomeNewWords());
    }

}
