package StringInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        // APPROACH 1 - using toCharArray()
        char[] chArr = str.toCharArray();
        for (int i = str.length() - 1; i >=0 ; i--) {
            System.out.print(chArr[i]);
        }
        System.out.println();

        // APPROACH 2 - using chatAt()
        for (int i = str.length() - 1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // APPROACH 3 - using stringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        // APPROACH 4 - using stringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

    }
}
