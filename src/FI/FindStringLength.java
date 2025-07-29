package FI;

@FunctionalInterface
interface StrLength{
    int findLength(String s);
}

public class FindStringLength {
    public static void main(String[] args) {
        StrLength strLength = s -> s.length();
        String input = "Java is GOAT !!";
        int length = strLength.findLength(input);
        System.out.println("Length of str is : " + length);

    }
}
