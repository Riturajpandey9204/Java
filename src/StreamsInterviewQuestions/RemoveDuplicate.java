package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "guava");
        // RemoveDuplicate and preserve insertion order
        list.stream().distinct().forEach(System.out::println);
    }
}
