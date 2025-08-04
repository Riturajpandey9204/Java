package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "guava");
        // RemoveDuplicate and preserve insertion order from a list
        list.stream().distinct().forEach(System.out::println);
        // Remove Duplicates from a list
        String str = "asdasdjfkljaf";
        str.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::print);
    }
}
