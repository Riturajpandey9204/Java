package StreamsInterviewQuestions;
//https://youtu.be/7TARP0aBffs
import java.util.function.IntPredicate;

public class CountVowelsUsingStreams {
    public static void main(String[] args) {
        // Using Java 8 Streams
        String str2 = "Ritu Raj Pandey";
        IntPredicate vowels = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a' || t == 'e' ||t == 'i' ||t == 'o' ||t == 'u' ||
                        t == 'A' ||t == 'E' ||t == 'I' ||t == 'O' ||t == 'U';
            }
        };
        long count = str2.chars().filter(vowels).count();
        System.out.println("String contains "+count+ " vowels");
    }
}
