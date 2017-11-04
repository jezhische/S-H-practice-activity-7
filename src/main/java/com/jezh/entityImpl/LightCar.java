package com.jezh.entityImpl;

import com.jezh.entity.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class LightCar extends VehicleImpl {
    public LightCar() {
        this.setType(Type.CAR);
    }
}
