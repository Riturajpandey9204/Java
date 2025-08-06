package StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class PrintMiddleCharacterOfAString {
    public static void main(String[] args) {

        //https://youtu.be/Ek1YPlNojqg?list=PL63BDXJjNfTElajNCfg_2u_pbe1Xi7uTy

        String str = "travel";
        int len = str.length();
        int mid = len/2;
        String midChar = IntStream.range(0,len).filter(x-> x%2 == 0 ? (x==mid || x == mid-1) : x== mid)
                .mapToObj(str ::charAt)
                .collect(StringBuilder::new,StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println(midChar);
        
    }
}
