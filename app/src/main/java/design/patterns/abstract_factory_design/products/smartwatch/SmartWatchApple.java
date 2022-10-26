package design.patterns.abstract_factory_design.products.smartwatch;

public class SmartWatchApple implements ISmartWatch {

    @Override
    public void showNotifcation(String msg) {
        System.out.println("Notification: "+msg);
    }

    @Override
    public boolean turnOnSmartWatch() {
        return true;
    }
    
}
