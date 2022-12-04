package design.patterns.builder_design;

public class SmartphoneBuilder {

    //smartphone reference
    private AbstractSmartphone smartphone;
    
    /* I did not include brand here as a variable as we are
     * setting brandName when creating the smartphone 
     * in the getSmartphone
     */

    /* Use Wrapper classes instead of primitives when 
     * certain properties are optional.
     * Specify Default values if certain fields are required.
     */

    private int ram=4; //minimum ram should be 4GB and storage should be 64GB we can specify default values
    private int storage=64;
    private String cpu;
    private float displaySize;
    private int camera;
    private String name;

    public int getRam(){
        return ram;
    }

    public int getStorage(){
        return storage;
    }

    public String getCpu(){
        return cpu;
    }

    public float getDisplaySize(){
        return displaySize;
    }

    public int getCamera(){
        return camera;
    }

    public String getName(){
        return name;
    }

    /*
     * Single Getter which creates Smartphone of provided brand 
     * with provided Smartphone properties. 
     */
    public AbstractSmartphone build(String brandName) {
        if("Samsung".equals(brandName))
            smartphone = new SmartphoneSamsung(this);
        else if("iPhone".equals(brandName))
            smartphone = new SmartphoneiPhone(this);
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
