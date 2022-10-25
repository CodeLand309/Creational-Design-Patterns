package design.patterns.builder_design;

public class SmartphoneiPhone extends AbstractSmartphone {
    
    public static String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getCpu() {
        return cpu;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public int getCamera() {
        return camera;
    }

    public String getName() {
        return name;
    }

    public SmartphoneiPhone(int ram, int storage, String cpu, float displaySize, int camera, String name, String brandName) {
        this.ram = ram;
        this.storage = storage;
        this.cpu = cpu;
        this.displaySize = displaySize;
        this.camera = camera;
        this.name = name;
        brand = brandName;
    }

    @Override
    public boolean makeCall(String phoneNumber){
        return true;
    }

    @Override
    public boolean sendSMS(String phoneNumber, String message){
        return true;
    }

    @Override
    public String takePhoto(){
        return "";
    }

    @Override
    public String shootVideo(){
        return "";
    }

}