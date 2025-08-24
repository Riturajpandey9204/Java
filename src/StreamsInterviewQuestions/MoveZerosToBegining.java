package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosToBegining {
    public static void main(String[] args) {
        int[] arr = {2,0,5,0,6,0,7,0};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // Approach 1
        List<Integer> zeros = list.stream().filter(x->x==0).collect(Collectors.toList());
        List<Integer> nonZeros = list.stream().filter(x->x != 0).collect(Collectors.toList());
        Stream<Integer> finalArray = Stream.concat(zeros.stream(),nonZeros.stream());
        finalArray.forEach(System.out::print);
        System.out.println();


        // Approach 2
         List<Integer> ans = list.stream()
                .collect(Collectors.partitioningBy(x->x!=0)).values().stream()
                .flatMap(x->x.stream()).collect(Collectors.toList());
        ans.forEach(System.out::print);
    }
}
