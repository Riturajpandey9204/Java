package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestLengthWord {
    public static void main(String[] args) {
        String str = "I am learning java Streams";
        String result = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println(result);
        System.out.println("Second highest length word !!");
        String ans = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(ans);

    }
}
