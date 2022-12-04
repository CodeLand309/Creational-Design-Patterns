package design.patterns.builder_design;

public class SmartphoneiPhone extends AbstractSmartphone {

    //iPhone Smartphone
    /* Brand is set as static because Brand name is common 
     * for smartphones released by the same brand
     */
    static String brandName="iPhone";
    
    public static String getBrand() {
        return brandName;
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

    public SmartphoneiPhone(SmartphoneBuilder smartphoneBuilder) {
        this.ram = smartphoneBuilder.getRam();
        this.storage = smartphoneBuilder.getStorage();
        this.cpu = smartphoneBuilder.getCpu();
        this.displaySize = smartphoneBuilder.getDisplaySize();
        this.camera = smartphoneBuilder.getCamera();
        this.name = smartphoneBuilder.getName();
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