package com.sergii.shutyi.model.role.refueler;

import com.sergii.shutyi.model.entity.vehicle.GasolineCar;
import com.sergii.shutyi.model.entity.human.Human;

public class Refueler implements IRefuel, IWashWindow, IPumpWheels {
    private Human human;

    public Refueler() {
    }

    public Refueler(Human human) {
        this.human = human;
    }

    public void refuel(GasolineCar gasolineCar) {
        if (gasolineCar.getFuel().equals(GasolineCar.Fuel.EMPTY)){
            gasolineCar.setFuel(GasolineCar.Fuel.FULL);
        }
    }

    public void washWindow(GasolineCar gasolineCar){
        if (gasolineCar.getWindow().equals(GasolineCar.Window.DIRTY)) {
            gasolineCar.setWindow(GasolineCar.Window.CLEAN);
        }
    }

    public void pumpWheels(GasolineCar gasolineCar){
        if (gasolineCar.getWheels().equals(GasolineCar.Wheels.UNPUMPED_WHEELS)) {
            gasolineCar.setWheels(GasolineCar.Wheels.PUMPED_WHEELS);
        }
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }
}
