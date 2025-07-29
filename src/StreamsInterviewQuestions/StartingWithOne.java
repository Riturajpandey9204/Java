package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWithOne {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(101,203,119, 183, 456, 890, 91);
        list.stream().filter(x -> !String.valueOf(x).startsWith("1")).forEach(System.out::println);
    }
}
