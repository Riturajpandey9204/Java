package StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharaterUsingMap {
    public static void main(String[] args) {
        String input = "AABBCDDEE";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
           char ch = input.charAt(i);
           /*if (map.containsKey(ch)){
               map.put(ch,map.get(ch) + 1);
           }else {
               map.put(ch , 1);
           }*/
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entrySet : map.entrySet()){
            if (entrySet.getValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}
