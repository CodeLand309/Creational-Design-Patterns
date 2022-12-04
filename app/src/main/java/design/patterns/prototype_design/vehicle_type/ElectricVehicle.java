package design.patterns.prototype_design.vehicle_type;

import design.patterns.prototype_design.energy_source.IEnergySource;

public class ElectricVehicle implements IVehicleType {
    
    private String co2Emissions;
    private IEnergySource energySource;
    private static String vehicleType = "Electric Vehicle";

    @Override
    public String toString() {
        return "ElectricVehicle [co2Emissions=" + co2Emissions + ", energySource=" + energySource + "]";
    }

    public ElectricVehicle(String co2Emissions, IEnergySource energySource) {
        this.co2Emissions = co2Emissions;
        this.energySource = energySource;
    }

    public String getCo2Emissions() {
        return co2Emissions;
    }

    public IEnergySource getEnergySource() {
        return energySource;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }
    
}
