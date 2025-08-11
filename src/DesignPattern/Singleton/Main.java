package DesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        // Calling Samosa Lazy way
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        // Calling Jalebi eager way
        Jalebi jalebi1 = Jalebi.getJalebi();
        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
        System.out.println(jalebi2.hashCode());

        //Singleton design pattern can be broke by
        // making the constructor public during runtime using reflection api.
        // This can be avoided by using enum instead of class.
        //
    }
}
