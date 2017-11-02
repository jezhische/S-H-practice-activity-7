package com.jezh.entityImpl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleImplTest {
    private VehicleImpl vehicle;

    @Before
    public void setUp() throws Exception {
        vehicle = new LightCar();
    }

    @After
    public void tearDown() throws Exception {
        vehicle = null;
    }

    @Test
    public void fuelConsumptionCalc() throws Exception {
        assertTrue(vehicle.fuelConsumptionCalc(100) == vehicle.getType().per100km);
    }

    @Test
    public void getName() throws Exception {
        assertEquals(vehicle.getName(), "LightCar");
    }

}