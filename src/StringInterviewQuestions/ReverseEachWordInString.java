package StringInterviewQuestions;

import java.io.LineNumberReader;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String input = "Java is GOAT";
        System.out.println("Original String : " + input);
        String output = "";
        String[] words = input.split(" ");
        for (String word : words){
            String reversedWord = "";
            for (int i = word.length()-1; i >= 0; i--) {
              reversedWord = reversedWord + word.charAt(i);
            }
            output = output + reversedWord + " ";
        }
        System.out.println("Reversed String : " + output);
    }
}
