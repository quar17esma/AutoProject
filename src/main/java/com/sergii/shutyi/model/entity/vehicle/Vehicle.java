package com.sergii.shutyi.model.entity.vehicle;

import com.sergii.shutyi.model.entity.DriverLicense;

public abstract class Vehicle {
    private String model;
    private String number;
    private DriverLicense.Category category;

    public Vehicle() {
    }

    public Vehicle(String model, String number, DriverLicense.Category category) {
        this.model = model;
        this.number = number;
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DriverLicense.Category getCategory() {
        return category;
    }

    public void setCategory(DriverLicense.Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", category=" + category +
                '}';
    }
}

