package org.example;

import org.example.vehicle.Vehicle;
import org.example.vehicle.bike.BikeFactory;
import org.example.vehicle.car.CarFactory;
import org.example.vehicle.car.SUV;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder + Factory");

        List<Vehicle> vehicles = new ArrayList<>();

        BikeFactory bikeFactory = new BikeFactory();
        CarFactory carFactory = new CarFactory();

        vehicles.add(bikeFactory.makePegasLaidBack("bike1"));
        vehicles.add(bikeFactory.makePegasStandard("bike2"));
        vehicles.add(carFactory.make4x4Jeep("myJeep", "Renegade"));

        vehicles.add(SUV.builder()
                .withName("myDuster")
                .withMaker("Dacia")
                .withModel("Duster")
                .with4x4(false)
                .build());

        vehicles.forEach(Vehicle::printDef);
    }
}
