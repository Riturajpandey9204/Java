package FI;

@FunctionalInterface
interface Interf{
    public void product(int x, int y);
}
public class Test {
    public static void main(String[] args) {

        Interf i = (a,b) -> System.out.println("Product is : " + a*b);
        i.product(2,4);
        i.product(200,400);

    }
}
