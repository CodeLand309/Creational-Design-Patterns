package design.patterns.prototype_design.vehicle;

public interface IVehicle {
    String startVehicle();
    String getVehicleCategory();

    /*
     * The cloneVehicle method copies the properties of the calling 
     * object and sets it to a new object of the same type and returns
     * that new object.
     */
    IVehicle cloneVehicle();
}
