package com.sergii.shutyi.model.role.repairer;

import com.sergii.shutyi.model.entity.vehicle.GasolineCar;
import com.sergii.shutyi.model.entity.human.Human;

public class Repairer implements IRepair {
    private Human human;

    public Repairer() {
    }

    public Repairer(Human human) {
        this.human = human;
    }

    public void repairEngine(GasolineCar gasolineCar) {
        if (gasolineCar.getEngine().equals(GasolineCar.Engine.BROKEN_ENGINE)) {
            gasolineCar.setEngine(GasolineCar.Engine.NEW_ENGINE);
        }
    }

    public void repairChassis(GasolineCar gasolineCar) {
        if (gasolineCar.getChassis().equals(GasolineCar.Chassis.BROKEN_CHASSIS)) {
            gasolineCar.setChassis(GasolineCar.Chassis.NEW_CHASSIS);
        }
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Repairer{" +
                "human=" + human +
                '}';
    }



}
