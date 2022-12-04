package design.patterns.prototype_design.energy_source;

public class Petrol implements IEnergySource{

    private int costPerKM;
    private String petrolType;

    public int getCostPerKM() {
        return costPerKM;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public Petrol(int costPerKM) {
        this.costPerKM = costPerKM;
        this.petrolType = "Normal";
    }

    public Petrol(int costPerKM, String petrolType) {
        this.costPerKM = costPerKM;
        this.petrolType = petrolType;
    }

    @Override
    public String toString() {
        return "Petrol [costPerKM=" + costPerKM + ", petrolType=" + petrolType + "]";
    }

    @Override
    public String provideEnergy() {
        return "Provie energy by igniting Petrol";
    }
    
}
