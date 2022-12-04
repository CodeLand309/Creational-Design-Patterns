package design.patterns.builder_design;

public class SimpleSmartphone {

    //Refer only this class for builder design
    private int ram;
    private int storage;
    private String cpu;
    private float displaySize;
    private int camera;
    private String name;
    private String brandName;

    private SimpleSmartphone(SmartphoneBuilder smartphoneBuilder){
        this.ram = smartphoneBuilder.ram;
        this.storage = smartphoneBuilder.storage;
        this.cpu = smartphoneBuilder.cpu;
        this.displaySize = smartphoneBuilder.displaySize;
        this.camera = smartphoneBuilder.camera;
        this.name = smartphoneBuilder.name;
        this.brandName = smartphoneBuilder.brandName;
    }

    /*
     * Using inner static class so that it can be directly accessed outside
     */
    public static class SmartphoneBuilder {
    
        /* Use Wrapper classes instead of primitives when 
         * certain properties are optional.
         * Specify Default values if certain fields are required.
         * In the below example there won't be null values as 
         */
    
        private int ram=4; //minimum ram should be 4GB and storage should be 64GB we can specify default values
        private int storage=64;
        private String cpu;
        private float displaySize;
        private int camera;
        private String name;
        private String brandName;
    
        /*
         * Build method returns the smartphone instance
         */
        public SimpleSmartphone build(){
            return new SimpleSmartphone(this);
        }

        /* Here we are returning the SmartphoneBuilder instance for each setter method
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
        public SmartphoneBuilder setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }         
    }
    
    //Smartphone funtionalities
    public boolean makeCall(String phoneNumber){
        return true;
    }
    public boolean sendSMS(String phoneNumber, String message){
        return true;
    }
    public String takePhoto(){
        return "";
    }
    public String shootVideo(){
        return "";
    }
}
