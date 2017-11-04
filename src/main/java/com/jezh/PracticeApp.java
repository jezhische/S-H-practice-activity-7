package com.jezh;

import com.jezh.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean("race1"));
        System.out.println(context.getBean("race2"));
        System.out.println(context.getBean("race3"));
        System.out.println(context.getBean("race4"));
    }
}
