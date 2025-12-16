package StreamsInterviewQuestions;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class CountSubString {
    public static void main(String[] args) {
        String str = "RajRajPandeyRajRitu";
        String check = "R";
        int n = check.length();
//        Long count = IntStream.range(0,str.length()-n)
//                .filter(x->str.substring(x,x+n).equals(check)).count();
//
//        System.out.println(count);
        /*Long count = IntStream.range(0,str.length()-n)
                .filter(x->str.substring(x,x+n).equals(check)).count();
        System.out.println(count);*/

        Long count = IntStream.range(0,str.length()-n)
                .filter(x->str.substring(x,x+n).equals(check)).count();
        System.out.println(count);
    }
}