package StreamsInterviewQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        Map<Character,Long> map = str.chars().mapToObj(x-> (char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Character ch = map.entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey()).findFirst().get();
        System.out.println(ch);
    }
}
