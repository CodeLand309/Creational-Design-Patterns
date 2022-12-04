package design.patterns.prototype_design;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import design.patterns.prototype_design.energy_source.Battery;
import design.patterns.prototype_design.energy_source.Petrol;
import design.patterns.prototype_design.vehicle.Bike;
import design.patterns.prototype_design.vehicle.Car;
import design.patterns.prototype_design.vehicle.IVehicle;
import design.patterns.prototype_design.vehicle_transmission.AutomaticTransmission;
import design.patterns.prototype_design.vehicle_transmission.ManualTransmission;
import design.patterns.prototype_design.vehicle_type.ElectricVehicle;

public abstract class AbstractPrototypeRegistry {

    protected Map<String, IVehicle> vehicles = new HashMap<>();

    public IVehicle getVehicle(String inputKey){
        Set<String> keys = vehicles.keySet();
        for(String key: keys){
            if(key.equals(inputKey)){
                return vehicles.get(key).cloneVehicle();
            }
        }
        return null;
    }

    public abstract void updateVehiclesRegistry();

    public void bundledVehicles(){
        //ELECTRIC
        vehicles.put("ELECTRIC_CAR_MANUAL", new Car(new ManualTransmission(), 
            new ElectricVehicle("less", new Battery(3))));
        vehicles.put("ELECTRIC_CAR_AUTO", new Car(new AutomaticTransmission(), 
            new ElectricVehicle("less", new Battery(3))));
        vehicles.put("ELECTRIC_BIKE", new Bike(new ManualTransmission(), 
            new ElectricVehicle("very less", new Battery(2))));
        vehicles.put("ELECTRIC_SCOOTER", new Bike(new AutomaticTransmission(), 
            new ElectricVehicle("very less", new Battery(2))));

        //FOSSIL FUEL POWERED
        vehicles.put("PETROL_CAR_MANUAL", new Car(new ManualTransmission(), 
            new ElectricVehicle("high", new Battery(8))));
        vehicles.put("PETROL_CAR_AUTO", new Car(new AutomaticTransmission(), 
            new ElectricVehicle("high", new Battery(8))));
        vehicles.put("PETROL_BIKE", new Bike(new ManualTransmission(), 
            new ElectricVehicle("more", new Petrol(6))));
        vehicles.put("PETROL_SCOOTER", new Bike(new AutomaticTransmission(), 
            new ElectricVehicle("more", new Petrol(6))));
    }

}
