package ZeroParameter;

@FunctionalInterface
interface ZeroParameter {
    void display();
}

public class WithoutLE {
    public static void main(String[] args)
    {
        ZeroParameter zeroParamLambda = new ZeroParameter() {

            @Override
            public void display() {
                System.out.println("This is a zero-parameter lambda expression!");
            }
        };

        zeroParamLambda.display();
    }
}

