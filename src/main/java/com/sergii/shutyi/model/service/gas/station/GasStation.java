package com.sergii.shutyi.model.service.gas.station;

import com.sergii.shutyi.model.entity.vehicle.GasolineCar;
import com.sergii.shutyi.model.role.refueler.Refueler;

public class GasStation {
    private Refueler refueler;

    public GasStation() {
    }

    public GasStation(Refueler refueler) {
        this.refueler = refueler;
    }

    public void refuel(GasolineCar gasolineCar){
        refueler.refuel(gasolineCar);
    }

    public void washWindow(GasolineCar gasolineCar){
        refueler.washWindow(gasolineCar);
    }

    public void pumpWheels(GasolineCar gasolineCar) {
        refueler.pumpWheels(gasolineCar);
    }

    public Refueler getRefueler() {
        return refueler;
    }

    public void setRefueler(Refueler refueler) {
        this.refueler = refueler;
    }
}
