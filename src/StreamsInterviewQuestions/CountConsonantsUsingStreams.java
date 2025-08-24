package StreamsInterviewQuestions;
//https://youtu.be/7TARP0aBffs
import java.util.function.IntPredicate;

public class CountConsonantsUsingStreams {
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
        IntPredicate consonants = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return Character.isLetter(t) && !vowels.test(t);
            }
        };
        long count = str2.chars().filter(consonants).count();
        System.out.println(count);
    }
}
