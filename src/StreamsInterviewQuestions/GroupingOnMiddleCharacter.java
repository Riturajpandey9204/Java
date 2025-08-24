package StreamsInterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingOnMiddleCharacter {
    public static void main(String[] args) {
        String[] strArr = {"eve", "swd", "rvt", "dws"};
        Map<String, List<String>> ans = Stream.of(strArr)
                .collect(Collectors.groupingBy(x->x.toString().substring(1,2)));
        System.out.println(ans);

    }
}
