package design.patterns.prototype_design;

import design.patterns.prototype_design.energy_source.Petrol;
import design.patterns.prototype_design.vehicle.Bike;
import design.patterns.prototype_design.vehicle_transmission.AutomaticTransmission;
import design.patterns.prototype_design.vehicle_type.ElectricVehicle;

public class PrototypeRegistryImpl extends AbstractPrototypeRegistry{

    @Override
    public void updateVehiclesRegistry() {
        vehicles.put("POWER_PETROL_SCOOTER", new Bike(new AutomaticTransmission(), 
            new ElectricVehicle("more", new Petrol(6, "Power"))));
        vehicles.put("NEW_BATTERY_ELECTRIC_SCOOTER", new Bike(new AutomaticTransmission(), 
            new ElectricVehicle("more", new Petrol(6, "New Battery Tech"))));
    }
    
}
