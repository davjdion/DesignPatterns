package org.example.vehicle.bike;

import org.example.vehicle.Vehicle;

public class Pegas implements Vehicle {

    private String name;
    private String model;

    @Override
    public Integer getNoOfWheels() {
        return 2;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMaker() {
        return "Pegas";
    }

    @Override
    public String getModel() {
        return this.model;
    }

    private Pegas(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void printDef() {
        System.out.println(getName() + " / " +
                getMaker() + " / " +
                getModel());
    }

    public static class Builder {
        private String name;
        private String model;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Pegas build() {
            return new Pegas(this.name, this.model);
        }
    }

    public static Pegas.Builder builder() {
        return new Builder();
    }
}
