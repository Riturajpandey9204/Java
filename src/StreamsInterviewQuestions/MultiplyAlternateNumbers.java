package StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class MultiplyAlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = IntStream.range(0,arr.length).filter(x -> x%2 != 0).map(x->arr[x])
                .reduce(1,(a,b)-> a*b);
        System.out.println(ans);
    }
}
