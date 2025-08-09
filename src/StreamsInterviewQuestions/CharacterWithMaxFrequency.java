package StreamsInterviewQuestions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterWithMaxFrequency {
    public static void main(String[] args) {

        String str = "javadeveloper";
        char ch =  str.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(ch);


        // https://youtu.be/7UVQmv2xZNk?list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy
    }
}
