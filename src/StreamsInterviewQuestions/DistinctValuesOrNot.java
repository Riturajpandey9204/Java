package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValuesOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        boolean ans = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).values()
                .stream().noneMatch(x->x>1);
        System.out.println(ans);
    }
}
