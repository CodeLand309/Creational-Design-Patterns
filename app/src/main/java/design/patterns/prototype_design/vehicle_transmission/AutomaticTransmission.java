package design.patterns.prototype_design.vehicle_transmission;

public class AutomaticTransmission implements IVehicleTransmission{

    @Override
    public String changeGear() {
        return "Gear changed automatically";
    }

    @Override
    public String toString() {
        return "AutomaticTransmission";
    }
    
}
