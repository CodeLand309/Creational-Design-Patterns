package design.patterns.singleton_design;

public class Singleton {

    //Static methods can handle only static variables 
    private static Singleton singleton;

    /* constructor declared private so that no other class 
     * can directly create instance of this class
     */
    private Singleton(){

    }

    /* this method should be static as instance creation responsibility 
     * has been been restricted to this class only. If instance does not
     * exist create new instance, else return the existing instance.
     */
    public static Singleton getSingleton(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
