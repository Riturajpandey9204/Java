package StringInterviewQuestions;

import java.io.LineNumberReader;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String input = "Java is GOAT";
        String output = "";
        String[] words = input.split(" ");
        for (String word : words) {
            String revWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);
            }
            output = output + revWord + " ";
        }
        System.out.println(output);
    }
}
