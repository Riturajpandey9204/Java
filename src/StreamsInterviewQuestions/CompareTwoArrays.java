package StreamsInterviewQuestions;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"one", "two"};
        String[] arr2 = {"Two", "one"};
        boolean arrayEquals = false;
        arrayEquals = Arrays.stream(arr1).unordered()
                .allMatch(x->Arrays.stream(arr2).anyMatch(y->x.equalsIgnoreCase(y)));
        System.out.println(arrayEquals);
    }
}
