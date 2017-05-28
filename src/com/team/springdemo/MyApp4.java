package com.team.springdemo;

import com.team.springdemo.teacher.DanskLangTeacher;
import com.team.springdemo.teacher.FrenchLangTeacher;
import com.team.springdemo.teacher.RusLangTeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxim on 5/28/17.
 */
public class MyApp4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("beanAnnotation-applicationContext.xml");

        //FrenchLangTeacher theFrenchTeacher = context.getBean("myFrenchTeacher", FrenchLangTeacher.class);
        //System.out.println(theFrenchTeacher.getSomeNewWords());

        //RusLangTeacher rusLangTeacher = context.getBean("rusLangTeacher", RusLangTeacher.class);
        //System.out.println(rusLangTeacher.getSomeNewWord());

        DanskLangTeacher danskLangTeacher = context.getBean("danskLangTeacher", DanskLangTeacher.class);
        System.out.println(danskLangTeacher.getDanskLang());
    }

}
