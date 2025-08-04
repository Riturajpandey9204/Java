package StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class MultiplyFirstLastAnsSoOn {
    public static void main(String[] args) {
        int[] arr = {4,2,5,1,6,7};
        IntStream.range(0, arr.length/2)
                .map(x->arr[x]*arr[arr.length-x-1])
                .forEach(System.out::println);
    }
}
