package design.patterns.factory_design;

public class IOS implements IOperatingSystem{

    @Override
    public String bootUp() {
        return "iOS booted Successfully";
    }

    @Override
    public boolean openAnApp() {
        return false;
    }
    
}
