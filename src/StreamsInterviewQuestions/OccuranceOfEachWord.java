package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class OccuranceOfEachWord {
    public static void main(String[] args) {
        String str = "I am learning java java";
        Map<String, Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);
    }
}
