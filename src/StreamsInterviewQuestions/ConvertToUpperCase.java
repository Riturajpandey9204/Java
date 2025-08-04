package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("raj","kaj");
        List<String> ansList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ansList);
    }
}
