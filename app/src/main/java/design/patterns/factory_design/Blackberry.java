package design.patterns.factory_design;

public class Blackberry implements IOperatingSystem {

    @Override
    public String bootUp() {
        return "Blackberry OS booted Successfully";
    }

    @Override
    public boolean openAnApp() {
        return false;
    }
    
}
