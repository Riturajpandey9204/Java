package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondMinimunInAnArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,7,2,4,5,6,8,9); // 2,4,5,6,7,8,9,10
        Optional<Integer> min = list.stream().sorted().skip(1).findFirst();
        min.ifPresent(System.out::println);
    }
}
