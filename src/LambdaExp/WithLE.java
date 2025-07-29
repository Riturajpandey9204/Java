package LambdaExp;


interface FuncInterface {
    void abstractFun(int x);
}

class WithLE{
    public static void main(String args[]) {
        FuncInterface fobj = (int x)->System.out.println(2*x);
        fobj.abstractFun(10);
    }
}
