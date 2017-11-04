package com.jezh.entityImpl;

import org.springframework.stereotype.Component;

@Component
public class HeavyTruck extends VehicleImpl {

    public HeavyTruck() {
        this.setType(Type.TRUCK);
    }
}
