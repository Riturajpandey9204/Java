package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultiplyArrayOfIntegers {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        List<Integer> integerList = Arrays.asList(arr);
        Optional<Integer> prod = integerList.stream().reduce((a, b)->a*b);
        System.out.println(prod.get());
    }
}
