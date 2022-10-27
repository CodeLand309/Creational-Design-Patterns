package design.patterns.prototype_design.vehicle;

import design.patterns.prototype_design.vehicle_transmission.IVehicleTransmission;
import design.patterns.prototype_design.vehicle_type.IVehicleType;

public class Car implements IVehicle {

    private int numberOfTyres;
    private int maxPassengerCount;
    private boolean vehicleStarted;
    private IVehicleTransmission transmission;
    private IVehicleType vehicleType;
    private static String vehicleCategory = "4 wheeler";

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public int getMaxPassengerCount() {
        return maxPassengerCount;
    }

    public boolean isVehicleStarted() {
        return vehicleStarted;
    }

    public IVehicleTransmission getTransmission() {
        return transmission;
    }

    public IVehicleType getVehicleType() {
        return vehicleType;
    }

    public Car(IVehicleTransmission transmission,
            IVehicleType vehicleType) {
        this.numberOfTyres = 4;
        this.maxPassengerCount = 5; //Assuming everyone sits comfortably :)
        this.transmission = transmission;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car [numberOfTyres=" + numberOfTyres + ", maxPassengerCount=" + maxPassengerCount + ", vehicleStarted="
                + vehicleStarted + ", transmission=" + transmission + ", vehicleType=" + vehicleType + "]";
    }

    @Override
    public String startVehicle() {
        vehicleStarted = true;
        return "Car/Jeep Started";
    }

    @Override
    public String getVehicleCategory() {
        return vehicleCategory;
    }

    @Override
    public IVehicle cloneVehicle() {
        return new Car(this.transmission, this.vehicleType);
    }
    
}
