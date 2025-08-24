package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListAsSingleList {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Ravi" , "Rohan" , "Shyam"),
                Arrays.asList("Manish", "Ritu", "Raj", "Sourav")
        );

        List<String> result = listOfList.stream()
                .flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(result);

        List<String> startingWithS = result.stream().filter(val -> val.startsWith("S")).collect(Collectors.toList());
        System.out.println("startingWithS : " + startingWithS);

    }
}
