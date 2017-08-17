package com.sergii.shutyi.model.entity.vehicle;

import com.sergii.shutyi.model.entity.DriverLicense;

public class GasolineCar extends Vehicle {
    private int horsePower;

    private Transmission transmission;

    private Engine engine;

    private Chassis chassis;

    private Wheels wheels;

    private Window window;

    private Fuel fuel;

    public GasolineCar() {
    }


    public GasolineCar(String model, String number, DriverLicense.Category category, int horsePower, Transmission transmission) {
        this.horsePower = horsePower;
        this.transmission = transmission;
    }

    public enum Engine {NEW_ENGINE, BROKEN_ENGINE}

    public enum Chassis {NEW_CHASSIS, BROKEN_CHASSIS}

    public enum Wheels {PUMPED_WHEELS, UNPUMPED_WHEELS}

    public enum Window {CLEAN, DIRTY}

    public enum Fuel {EMPTY, FULL}

    public enum Transmission {MECHANICAL, AUTOMATIC}

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }
}
