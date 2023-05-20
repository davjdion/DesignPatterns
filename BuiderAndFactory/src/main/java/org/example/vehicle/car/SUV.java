package org.example.vehicle.car;

import org.example.vehicle.Vehicle;

public class SUV implements Vehicle {

    private String name;
    private String maker;
    private String model;
    private Boolean is4x4;

    @Override
    public Integer getNoOfWheels() {
        return 4;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getMaker() {
        return this.maker;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public void printDef() {
        String str4x4 = "";
        if (is4x4) {
            str4x4 = " / 4x4";
        }
        System.out.println(getName() + " / " +
                getMaker() + " / " +
                getModel() +
                str4x4);
    }

    private SUV(String name, String maker, String model, Boolean is4x4) {
        this.name = name;
        this.maker = maker;
        this.model = model;
        this.is4x4 = is4x4;
    }

    public static class Builder {

        private String name;
        private String maker;
        private String model;
        private Boolean is4x4;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withMaker(String maker) {
            this.maker = maker;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder with4x4(Boolean is4x4) {
            this.is4x4 = is4x4;
            return this;
        }

        public SUV build() {
            return new SUV(this.name, this.maker, this.model, this.is4x4);
        }
    }

    public static SUV.Builder builder() {
        return new Builder();
    }
}

