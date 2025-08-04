package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RemoveAllNonIntegers {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ra324","ah786");
        Pattern pattern = Pattern.compile("[^0-9]");
        List<String> ans = list.stream()
                .map(x->pattern.matcher(x).replaceAll(""))
                .collect(Collectors.toList());
        System.out.println(ans);

    }
}
