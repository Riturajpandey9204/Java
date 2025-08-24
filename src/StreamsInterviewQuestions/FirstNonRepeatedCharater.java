package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharater {
    public static void main(String[] args) {
        String str = "Hello World!! ";
        /*String ans = Arrays.stream(str.split("")).filter(c-> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
        System.out.println(ans);*/

        // TODO : 2nd Method
        // https://youtu.be/__iFugXuwsY?list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy

        // TODO : My method
        Map<Character, Long> map = str.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

        System.out.println(map);
        Character ch = map.entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).findFirst().get();
        System.out.println(ch);

    }
}
