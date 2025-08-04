package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertNumbersToSquares {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> squaredList = list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squaredList);
    }
}
