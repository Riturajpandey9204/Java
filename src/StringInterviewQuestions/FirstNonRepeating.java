package StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "AABCCDDRRF";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           if (map.containsKey(ch)){
               map.put(ch, map.get(ch) + 1);
           }else {
               map.put(ch,1);
           }
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println("Not found");
    }
}
