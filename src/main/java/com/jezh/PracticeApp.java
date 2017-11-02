package com.jezh;

import com.jezh.base.Track;
import com.jezh.baseImpl.TrackImpl;
import com.jezh.entity.Vehicle;
import com.jezh.entityImpl.HeavyTruck;
import com.jezh.entityImpl.LightCar;
import com.jezh.race.Race;
import com.jezh.raceImpl.RaceImpl;

public class PracticeApp {
    public static void main(String[] args) {
        Vehicle car = new LightCar();
        Vehicle truck = new HeavyTruck();
        Track shorter = new TrackImpl(8);
        Track longer = new TrackImpl(25);

        System.out.println(new RaceImpl(shorter, car));
        System.out.println(new RaceImpl(shorter, truck));
        System.out.println(new RaceImpl(longer, car));
        System.out.println(new RaceImpl(longer, truck));
    }
}
