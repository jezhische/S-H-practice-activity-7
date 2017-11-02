package com.jezh.raceImpl;

import com.jezh.base.Track;
import com.jezh.entity.Vehicle;
import com.jezh.entityImpl.VehicleImpl;
import com.jezh.race.Race;

public class RaceImpl implements Race {

    private Track track;
    private Vehicle vehicle;

    public RaceImpl(Track track, Vehicle vehicle) {
        this.track = track;
        this.vehicle = vehicle;
    }

    public double getSpentFuel() {
        return vehicle.fuelConsumptionCalc(track.getDistance());
    }

    @Override
    public String toString() {
        return String.format(">> Race: track length: %dkm,  \tvehicle type: %s,  \tbrand: %s, \tspent fuel: %.2fl",
                track.getDistance(), ((VehicleImpl)vehicle).getType(), vehicle.getName(), getSpentFuel());
    }
}
