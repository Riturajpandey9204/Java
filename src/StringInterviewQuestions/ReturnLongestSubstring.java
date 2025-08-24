package StringInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class ReturnLongestSubstring {
    public static void main(String[] args) {
        String s = "acbcabcbbcabd";
        System.out.println(longestSubstring(s)); // cabd
    }

    private static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;  // store the starting index of the longest substring
            }
        }
        return s.substring(start, start + maxLength);
    }
}
