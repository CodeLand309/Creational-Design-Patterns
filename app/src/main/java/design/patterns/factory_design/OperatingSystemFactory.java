package design.patterns.factory_design;

public class OperatingSystemFactory {
    
    //Factory class is responsible for developing the OS based on the client requirement
    public IOperatingSystem developOS(AvailableOS os){
        switch(os){
            case ANDROID:
                return new Android();
            case IOS:
                return new IOS();
            case BLACKBERRY:
                return new Blackberry();
            default:
                System.out.println("I don't know how to develop this OS");
                return null;
        }
    }
}
