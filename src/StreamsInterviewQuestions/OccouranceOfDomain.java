package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccouranceOfDomain {

    public static void main(String[] args) {
        List<Executive> executiveList = Arrays.asList(
                new Executive("Raj", "raj@gmail.com"),
                new Executive("Baaj", "baj@gmail.com"),
                new Executive("Taj", "taj@yahoo.com"),
                new Executive("Saaj", "saaj@yahoo.com")
        );
        Map<String , Long> map = executiveList.stream()
                .map(x->x.geteEmail().substring(x.geteEmail().indexOf("@")))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
