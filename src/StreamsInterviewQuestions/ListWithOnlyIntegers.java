package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithOnlyIntegers {
    public static void main(String[] args) {
        String[] str = {"abc", "123", "321", "xyz"};
        List<Integer> list = Arrays.stream(str).filter(x-> x.matches("[0-9]+"))
                .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list);
    }
}
