package Munnu;

// Demonstrating Method Overloading
import java.io.*;

class OverloadingExample {

    static int add(int a, int b) { return a + b; }

    static int add(int a, int b, int c) {return a* b * c;}

    public static void main(String args[])
    {

        System.out.println(add(4, 6));
        System.out.println(add(4, 6, 7));
    }
}
