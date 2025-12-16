package StringInterviewQuestions;
//https://youtu.be/7TARP0aBffs
import java.util.function.IntPredicate;

public class CountVowels {

    // Using Java
    public static boolean isVowel(char t){
        return t == 'a' || t == 'e' ||t == 'i' ||t == 'o' ||t == 'u' ||
                t == 'A' ||t == 'E' ||t == 'I' ||t == 'O' ||t == 'U';
    }


    public static void main(String[] args) {
        String str = "Testing";
        int vCount = 0;
        for (int i = 0 ; i < str.length();i++){
            if(isVowel(str.charAt(i))){
                vCount++;
            }
        }
        System.out.println("Vowels count : " + vCount);

        // Using Java 8 Streams
        System.out.println("Using Java 8 Streams");

        String str2 = "Ritu Raj Pandey";
        IntPredicate vowels = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a'||t == 'e'||t == 'i'||t == 'o'||t == 'u'||t == 'A'||
                        t == 'E'||t == 'I'||t == 'O'||t == 'U';
            }
        };
        Long count = str2.chars().filter(vowels).count();
        System.out.println("Just now : "+count);

    }
}