package design.patterns.prototype_design.energy_source;

public class Battery implements IEnergySource{

    private int costPerKM;
    private String batteryType;

    public int getCostPerKM() {
        return costPerKM;
    }

    @Override
    public String toString() {
        return "Battery [costPerKM=" + costPerKM + ", batteryType=" + batteryType + "]";
    }

    public String getBatteryType() {
        return batteryType;
    }

    public Battery(int costPerKM) {
        this.costPerKM = costPerKM;
        this.batteryType = "Lithium Ion";
    }

    public Battery(int costPerKM, String batteryType) {
        this.costPerKM = costPerKM;
        this.batteryType = batteryType;
    }

    @Override
    public String provideEnergy() {
        return "Provide Energy from battery";
    }
    
}
