package ZeroParameter;

// Java program to demonstrates Lambda expression with zero parameter
@FunctionalInterface
interface ZeroParameter1 {
    void display();
}

public class WithLE {
    public static void main(String[] args)
    {
        ZeroParameter1 zeroParamLambda = ()
                -> System.out.println(
                "This is a zero-parameter lambda expression!");

        zeroParamLambda.display();
    }
}