package design.patterns.factory_design;

public class Android implements IOperatingSystem{

    @Override
    public String bootUp() {
        return "Android booted Successfully";
    }

    @Override
    public boolean openAnApp() {
        return false;
    }
    
}
