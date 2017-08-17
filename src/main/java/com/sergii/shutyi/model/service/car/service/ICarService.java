package com.sergii.shutyi.model.service.car.service;

import com.sergii.shutyi.model.entity.vehicle.GasolineCar;

public interface ICarService {
    void repairEngine(GasolineCar gasolineCar);

    void repairChassis(GasolineCar gasolineCar);
}
