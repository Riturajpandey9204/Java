package StreamsInterviewQuestions;

import java.util.stream.IntStream;

public class CountSubString {
    public static void main(String[] args) {
        String str = "RajRajPandeyRajRitu";
        String check = "Raj";
        Long count = IntStream.range(0,str.length()-2).filter(x->str.substring(x,x+3).equals(check)).count();

        System.out.println(count);
    }
}
