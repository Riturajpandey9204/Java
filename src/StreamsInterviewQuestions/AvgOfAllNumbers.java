package StreamsInterviewQuestions;

import jdk.nashorn.internal.objects.annotations.Function;

import java.util.Arrays;
import java.util.List;

public class AvgOfAllNumbers {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,22,3,4,5,6,6,77,8);

        //Avg of all the numbers.

        double avg = list.stream().mapToDouble(x->x).average().getAsDouble();
        System.out.println(avg);
    }
}