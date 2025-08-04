package StringInterviewQuestions;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","SileNt"));

    }
    public static boolean isAnagram(String s1 , String s2){
        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s1.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }
}
