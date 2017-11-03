package com.jezh;

import com.jezh.base.Track;
import com.jezh.baseImpl.TrackImpl;
import com.jezh.entity.Vehicle;
import com.jezh.entityImpl.HeavyTruck;
import com.jezh.entityImpl.LightCar;
import com.jezh.race.Race;
import com.jezh.raceImpl.RaceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("race1"));
    }
}
