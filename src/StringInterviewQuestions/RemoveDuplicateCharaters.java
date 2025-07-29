package StringInterviewQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateCharaters {
    public static void main(String[] args) {
        String str = "Programming";

        // Using java8 distinct method
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);
        System.out.println();
        // Using set
        StringBuilder sb1 = new StringBuilder();
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < str.length() ; i++) {
           set.add(str.charAt(i));
        }
        for (Character c : set){
            sb1.append(c);
        }
        System.out.println(sb1);
    }
}
