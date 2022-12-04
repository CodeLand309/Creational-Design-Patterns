package design.patterns.abstract_factory_design.products.earbuds;

public class EarbudsGoogle implements IEarbuds{

    @Override
    public boolean takeCall(String phoneNumber) {
        return true;
    }

    @Override
    public boolean connectToDevice(String deviceName) {
        return true;
    }
    
}
