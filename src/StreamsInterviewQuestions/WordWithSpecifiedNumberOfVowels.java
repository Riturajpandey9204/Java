package StreamsInterviewQuestions;

import java.util.Arrays;

public class WordWithSpecifiedNumberOfVowels {
    public static void main(String[] args) {
        String str = "I am learning Stream API in java";
        Arrays.stream(str.split(" "))
                .filter(x->x.replaceAll("[^aeiouAEIOU]","").length() == 2)
                .forEach(System.out::println);
    }
}