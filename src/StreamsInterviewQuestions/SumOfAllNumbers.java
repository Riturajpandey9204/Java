package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,3,4,5,6,6,77,8);
        // Sum of all the numbers

        System.out.println("Sum : "+list.stream().reduce(Integer::sum).get());
    }
}
