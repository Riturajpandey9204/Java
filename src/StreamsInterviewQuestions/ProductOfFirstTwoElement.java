package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ProductOfFirstTwoElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int ans = Arrays.stream(arr).boxed().collect(Collectors.toList())
                .stream().limit(2).reduce(1,(a,b)->a*b);
        System.out.println(ans);

        // TODO : try some more reduction operation.
    }
}
