package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideIntoEvenAndOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<List<Integer>> listList = list.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()))
                .entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
        System.out.println(listList);
    }
}
