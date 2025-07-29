package Munnu.FI;

@FunctionalInterface
interface Interf{
    public abstract void m1();
    //SAM
}
public class fiTest {
    public static void main(String[] args) {
       Interf i = () -> System.out.println("M1 method");
        i.m1();
    }
}
