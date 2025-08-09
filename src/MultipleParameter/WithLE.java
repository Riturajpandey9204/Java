package MultipleParameter;

@FunctionalInterface
interface Functional {
    int operation(int a, int b);
}

public class WithLE {

    public static void main(String[] args) {

        Functional add = Integer::sum;
        Functional multiply = (a, b) -> a * b;

        System.out.println(add.operation(6, 3));
        System.out.println(multiply.operation(4, 5));
    }
}
