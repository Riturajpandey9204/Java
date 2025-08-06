package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConvertToUpperCaseAndConcatenate {
    public static void main(String[] args) {
        List<String> characterList = Arrays.asList("a", "b", "c");
        String ans = characterList.stream().map(String::toUpperCase).reduce((a,b)->a + " " + b).orElse("");
        System.out.println(ans);
    }
}
