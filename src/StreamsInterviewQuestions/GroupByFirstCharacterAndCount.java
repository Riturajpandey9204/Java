package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstCharacterAndCount {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "apricot","banana","blueberry","cherry");
        Map<Character,Long> map = stringList.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
        System.out.println(map);
    }
}