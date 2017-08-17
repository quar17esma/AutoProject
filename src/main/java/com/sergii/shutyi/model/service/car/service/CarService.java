package com.sergii.shutyi.model.service.car.service;

import com.sergii.shutyi.model.entity.vehicle.GasolineCar;
import com.sergii.shutyi.model.role.repairer.Repairer;

public class CarService implements ICarService {
    private Repairer repairer;

    public CarService() {
    }

    public CarService(Repairer repairer) {
        this.repairer = repairer;
    }

    public void repairEngine(GasolineCar gasolineCar){
        repairer.repairEngine(gasolineCar);
    }

    public void repairChassis(GasolineCar gasolineCar) {
        repairer.repairChassis(gasolineCar);
    }

    public Repairer getRepairer() {
        return repairer;
    }

    public void setRepairer(Repairer repairer) {
        this.repairer = repairer;
    }
}
