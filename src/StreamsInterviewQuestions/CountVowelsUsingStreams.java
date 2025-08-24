package StreamsInterviewQuestions;
//https://youtu.be/7TARP0aBffs
import java.util.function.IntPredicate;

public class CountVowelsUsingStreams {
    public static void main(String[] args) {
        // Using Java 8 Streams
        String str2 = "Ragni";
        IntPredicate vowels = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value == 'a' || value == 'e' ||value == 'i' ||value == 'o' ||
                        value == 'u' ||value == 'A' ||value == 'E' ||value == 'I' ||
                        value == 'O' ||value == 'U';
            }
        };
        Long count = str2.chars().filter(vowels).count();
        System.out.println(count);
    }
}
