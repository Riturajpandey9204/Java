package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertLoSToMapOfStringAndItsLength {
    public static void main(String[] args) {
        List<String > stringList = Arrays.asList("apple", "Mango", "banana");
        Map<String,Integer> map = stringList.stream()
                .collect(Collectors.toMap(Function.identity(),String::length,(existing,duplicate)-> existing));
        System.out.println(map);
    }
}
