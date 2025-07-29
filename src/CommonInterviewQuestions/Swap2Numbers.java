package CommonInterviewQuestions;

public class Swap2Numbers {
    public static void main(String[] args) {
    int a = 2, b = 3;
        System.out.println(" Before swapping A = " + a + " B = " + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(" After Swapping A = " + a + " B = " + b);
    }
}
