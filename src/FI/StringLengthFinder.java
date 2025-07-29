package FI;

@FunctionalInterface
interface Interf1{
    public void strLength(String s);
}
public class StringLengthFinder {
    public static void main(String[] args) {
        Interf1 i1 = s -> System.out.println(s.length());
        i1.strLength("Rituraj");
        i1.strLength("Rituraj Pandey");
    }
}
