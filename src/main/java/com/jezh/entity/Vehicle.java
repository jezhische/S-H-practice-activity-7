package com.jezh.entity;

public interface Vehicle {


    /**
     *
     * (расчет расхода топлива на пройденную дистанцию)
     * @param distance
     * @return
     */
    double fuelConsumptionCalc(double distance);

    String getName();
}
