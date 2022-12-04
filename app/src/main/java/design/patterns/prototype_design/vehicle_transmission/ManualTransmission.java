package design.patterns.prototype_design.vehicle_transmission;

public class ManualTransmission implements IVehicleTransmission{

    @Override
    public String changeGear() {
        return "Gear changed Manually";
    }

    @Override
    public String toString() {
        return "ManualTransmission";
    }
    
}
