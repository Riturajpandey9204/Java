package MultipleParameter;

@FunctionalInterface
interface Functional1 {
    int operation(int a, int b);
}

public class WithoutLE {

    public static void main(String[] args) {

        Functional1 add = new Functional1() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        Functional1 multiply = new Functional1() {
            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(add.operation(6, 3));      // Output: 9
        System.out.println(multiply.operation(4, 5)); // Output: 20
    }
}
