package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PairAnagrams {
    public static void main(String[] args) {
        String[] str = {"pan","nap", "Team", "Meat"};
        List<String> stringList = Arrays.asList(str);
        Collection<List<String>> ans = stringList.stream()
                .collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList())))
                .values();
        System.out.println(ans);
    }
}
