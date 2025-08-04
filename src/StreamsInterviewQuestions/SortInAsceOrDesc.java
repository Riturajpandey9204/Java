package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class SortInAsceOrDesc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,35,12};
        Arrays.stream(arr).mapToObj(x-> x).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
