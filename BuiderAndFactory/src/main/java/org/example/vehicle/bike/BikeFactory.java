package org.example.vehicle.bike;

import org.example.vehicle.Vehicle;

public class BikeFactory {
    public Vehicle makePegasLaidBack(String name) {
        return Pegas.builder()
                .withName(name)
                .withModel("LaidBack")
                .build();
    }

    public Vehicle makePegasStandard(String name) {
        return Pegas.builder()
                .withName(name)
                .withModel("Standard")
                .build();
    }
}

