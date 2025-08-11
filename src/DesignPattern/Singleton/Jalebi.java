package DesignPattern.Singleton;

public class Jalebi {
    //Eager Way of creating singleton object
    private static Jalebi jalebi = new Jalebi();
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
