package com.jezh.config;

import com.jezh.base.Track;
import com.jezh.baseImpl.TrackImpl;
import com.jezh.entity.Vehicle;
import com.jezh.race.Race;
import com.jezh.raceImpl.RaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources({@PropertySource("races.properties"),
        @PropertySource("routs.properties"),
        @PropertySource("vehicles.properties")})
@ComponentScan("com.jezh.entityImpl")
public class AppConfig {

    @Autowired private Vehicle lightCar;
    @Autowired private Vehicle heavyTruck;
    @Value("${shorty}") private String shorty;
    @Value("${longy}") private String longy;

    @Bean
    public Track shorter() {
        return new TrackImpl(Integer.valueOf(shorty));
    }
    @Bean
    public Track longer() {
        return new TrackImpl(Integer.valueOf(longy));
    }
    @Bean
    public Race race1() {
        return new RaceImpl(shorter(), lightCar);
    }
    @Bean
    public Race race2() {
        return new RaceImpl(shorter(), heavyTruck);
    }
    @Bean
    public Race race3() {
        return new RaceImpl(longer(), lightCar);
    }
    @Bean
    public Race race4() {
        return new RaceImpl(longer(), heavyTruck);
    }
}
