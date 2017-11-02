package com.jezh.entityImpl;

import com.jezh.entity.Vehicle;

public class VehicleImpl implements Vehicle {

    private static enum Type {
        CAR(13), TRACK(28);
        private int per100km;

        Type(int per100km) {
            this.per100km = per100km;
        }
    }

    private Type type;

    @Override
    public int fuelConsumptionCalc(Vehicle vehicleOnTheRun, int distance) {
        return ((VehicleImpl) vehicleOnTheRun).getType().per100km * distance / 100;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
