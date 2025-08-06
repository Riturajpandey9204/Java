package StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class CountSubString {
    public static void main(String[] args) {
        String str = "RajRajPandeyRajRitu";
        String check = "R";
/*        long ans = IntStream.range(0,str.length()-2)
                .filter(x->str.substring(x,x+3).equals(check))
                .count(); // if Raj*/
        long ans = IntStream.range(0,str.length())
                .filter(x->str.substring(x,x+1).equals(check))
                .count();// if only R
        System.out.println(ans);
    }
}
