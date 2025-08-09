package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsWithOnlyDigits {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("123", "abc" , "as123", "4321");
        List<String> ansList = list.stream().filter(x->x.matches("\\d+")).collect(Collectors.toList());
        System.out.println(ansList);
        // Can also use ("[0-9]+") or ("\\d+")
        //input.matches("[a-zA-Z]") // to check whether a given input character is an alphabet (A–Z or a–z)
    }
}
