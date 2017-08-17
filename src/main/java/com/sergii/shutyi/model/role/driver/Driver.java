package com.sergii.shutyi.model.role.driver;

import com.sergii.shutyi.model.entity.DriverLicense;
import com.sergii.shutyi.model.entity.vehicle.GasolineCar;
import com.sergii.shutyi.model.entity.human.Human;

public class Driver implements IDrive {
    private Human human;
    private DriverLicense driverLicense;

    public Driver() {
    }

    public Driver(Human human, DriverLicense driverLicense) {
        this.human = human;
        this.driverLicense = driverLicense;
    }

    public void drive(GasolineCar gasolineCar) {
        System.out.println("Drive car");
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "human=" + human +
                ", driverLicense=" + driverLicense +
                '}';
    }


}
