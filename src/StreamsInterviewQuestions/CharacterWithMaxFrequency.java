package StreamsInterviewQuestions;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterWithMaxFrequency {
    public static void main(String[] args) {

        String str = "javadeveloper";

//        Map<Character,Long> map = str.chars().mapToObj(x->(char)x)
//                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
//
//        Optional<Character> ch = map.entrySet().stream().max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey);
//        System.out.println(ch.get());
        // https://youtu.be/7UVQmv2xZNk?list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy

        Map<Character,Long> map = str.chars().mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(x->x, Collectors.counting()));

        Optional<Character> ch = map.entrySet().stream().max(Map.Entry.comparingByValue())
                .map((Map.Entry::getKey));
        System.out.println(ch.get());
    }
}
