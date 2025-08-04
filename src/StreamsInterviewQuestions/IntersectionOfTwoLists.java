package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,4,5,6);
        List<Integer> list2 = Arrays.asList(2,3,5,6,8);
        List<Integer> intersecList = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(intersecList);

    }
}
