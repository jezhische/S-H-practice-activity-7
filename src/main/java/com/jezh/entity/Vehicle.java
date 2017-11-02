package com.jezh.entity;

public interface Vehicle {


    /**
     *
     * (расчет расхода топлива на пройденную дистанцию)
     * @param vehicleOnTheRun
     * @param distance
     * @return
     */
    int fuelConsumptionCalc(Vehicle vehicleOnTheRun, int distance);

    String getName();

    static int getFuelConsumption() {
        return 0;
    };
}
