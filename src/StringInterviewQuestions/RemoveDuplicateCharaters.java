package StringInterviewQuestions;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateCharaters {
    public static void main(String[] args) {
        String str = "Programming";
        // Using java8 distinct method
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(x->sb.append((char) x));
        System.out.println(sb);
        // Using set
        /*StringBuilder sb1 = new StringBuilder();
        Set<Character> set = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
           set.add(str.charAt(i));
        }
        for(Character ch : set){
            sb1.append(ch);
        }
        System.out.println(sb1);*/
    }
}
