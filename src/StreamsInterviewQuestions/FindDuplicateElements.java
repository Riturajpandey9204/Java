package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,22,4,6,7,4,7,99,9,99,22);
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicateElements =
                list.stream()
                .filter( ele -> !uniqueElements.add(ele))
                .distinct().collect(Collectors.toList());
        System.out.println(duplicateElements);

    }

    // Using 2 for loops - worst soln
    // 
}
