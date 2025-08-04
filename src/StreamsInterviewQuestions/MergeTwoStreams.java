package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoStreams {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,3,5,6);
        List<Integer> list2 = Arrays.asList(2,3,7,9);
        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
    }
}
