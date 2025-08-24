package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DistinctNumberStartingWithOneInDescOrder {
    public static void main(String[] args) {
        int[] arr = {121,132,342, 167,654, 45,23,11, 1143};
        Arrays.stream(arr).filter(x->String.valueOf(x).startsWith("1"))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
