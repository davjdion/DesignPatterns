package org.example.vehicle.car;

import org.example.vehicle.Vehicle;

public class CarFactory {
    public Vehicle make4x4Jeep(String name, String model) {
        return SUV.builder()
                .withName(name)
                .withMaker("Jeep")
                .withModel(model)
                .with4x4(true)
                .build();
    }

    public Vehicle make2wdJeep(String name, String model) {
        return SUV.builder()
                .withName(name)
                .withModel("Jeep")
                .withModel(model)
                .with4x4(false)
                .build();
    }
}
