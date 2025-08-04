package StreamsInterviewQuestions;

import java.util.Arrays;

public class FirstNonRepeatedCharater {
    public static void main(String[] args) {
        String str = "Hello World!! ";
        String ans = Arrays.stream(str.split("")).filter(c-> str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
        System.out.println(ans);

        // TODO : 2nd Method
        // https://youtu.be/__iFugXuwsY?list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy

    }
}
