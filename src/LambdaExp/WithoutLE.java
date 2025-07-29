package LambdaExp;


interface FuncInterface1 {
    void abstractFun(int x);
}

class MyClass implements FuncInterface1 {
    @Override
    public void abstractFun(int x) {
        System.out.println(2 * x);
    }
}

public class WithoutLE {
    public static void main(String[] args) {
        FuncInterface1 fobj = new MyClass();
        fobj.abstractFun(5);  // prints 10
    }
}

