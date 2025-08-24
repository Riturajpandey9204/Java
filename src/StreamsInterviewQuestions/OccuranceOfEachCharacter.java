package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {
        String str = "RituRajPandey";
        Map<String,Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);

/*        Map<Character,Long> map1 = str.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map1);
        Character ch = map1.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
        System.out.println(ch);*/
    }
}