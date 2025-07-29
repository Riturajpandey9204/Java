package FI;

public class MyIntrfImpl {
    public static void main(String[] args) {
        SumIntrf sumIntrf = (a, b) -> a+b;

        System.out.println(sumIntrf.sum(2,4));
    }
}
