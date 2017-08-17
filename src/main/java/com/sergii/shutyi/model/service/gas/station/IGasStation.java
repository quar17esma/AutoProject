package com.sergii.shutyi.model.service.gas.station;

import com.sergii.shutyi.model.entity.vehicle.GasolineCar;

public interface IGasStation {
    void refuel(GasolineCar gasolineCar);

    void washWindow(GasolineCar gasolineCar);

    void pumpWheels(GasolineCar gasolineCar);
}
