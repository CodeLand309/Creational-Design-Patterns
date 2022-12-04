package design.patterns.builder_design;

public abstract class AbstractSmartphone {

    //Smartphone properties
    protected int ram;
    protected int storage;
    protected String cpu;
    protected float displaySize;
    protected int camera;
    protected String name;

    //Smartphone funtionalities
    public abstract boolean makeCall(String phoneNumber);
    public abstract boolean sendSMS(String phoneNumber, String message);
    public abstract String takePhoto();
    public abstract String shootVideo();

}
