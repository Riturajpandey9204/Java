package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfStringInAlphabeticOrder {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Raj" , "Ram", "Shyam", "Aam");
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
