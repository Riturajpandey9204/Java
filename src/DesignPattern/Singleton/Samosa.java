package DesignPattern.Singleton;

public class Samosa {
    //Lazy way of creating singleton
    private Samosa(){
    // private Constructor
    }
    private static Samosa samosa; // public static referenced Variable
    public static Samosa getSamosa(){ // public static factory method
        synchronized (Samosa.class){ //Using synchronized block in case of multithreaded environment
            if(samosa == null){
                samosa = new Samosa();
            }
        }
        return samosa;
    }

}
