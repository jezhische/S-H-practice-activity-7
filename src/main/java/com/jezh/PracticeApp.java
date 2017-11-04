package com.jezh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("race1"));
        System.out.println(context.getBean("race2"));
        System.out.println(context.getBean("race3"));
        System.out.println(context.getBean("race4"));
    }
}
