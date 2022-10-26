package design.patterns.builder_design;

public class SmartphoneBuilder {

    //smartphone reference
    private AbstractSmartphone smartphone;
    
    /* I did not include brand here as a variable as we are
     * setting brandName when creating the smartphone 
     * in the getSmartphone
     */
    private int ram;
    private int storage;
    private String cpu;
    private float displaySize;
    private int camera;
    private String name;

    /*
     * Single Getter which creates Smartphone of provided brand 
     * with provided Smartphone properties. 
     */
    public AbstractSmartphone getSmartphone(String brandName) {
        if("Samsung".equals(brandName))
            smartphone = new SmartphoneSamsung(ram, storage, cpu, displaySize, camera, name, brandName);
        else if("iPhone".equals(brandName))
            smartphone = new SmartphoneiPhone(ram, storage, cpu, displaySize, camera, name, brandName);
        return smartphone;
    }

    /* Here we are returning the SmartphoneBuilder for each setter method
     * which would allow us to chain methods
     */

    public SmartphoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public SmartphoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public SmartphoneBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public SmartphoneBuilder setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public SmartphoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public SmartphoneBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
}
