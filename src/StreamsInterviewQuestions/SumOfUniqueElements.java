package StreamsInterviewQuestions;

import java.util.Arrays;

public class SumOfUniqueElements {

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,3,1,3,2,4,5,5,3,4};
        System.out.println(Arrays.stream(arr).distinct().sum());

    }
}
