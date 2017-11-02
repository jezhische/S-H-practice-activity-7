package com.jezh.entityImpl;

import com.jezh.entity.Vehicle;

public abstract class VehicleImpl implements Vehicle {

    protected static enum Type {
        CAR(13), TRUCK(28);
        protected int per100km;

        Type(int per100km) {
            this.per100km = per100km;
        }
    }

    private Type type;

    @Override
    public double fuelConsumptionCalc(double distance) {
        return this.getType().per100km * distance / 100;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    public Type getType() {
        return type;
    }

    protected void setType(Type type) {
        this.type = type;
    }
}
