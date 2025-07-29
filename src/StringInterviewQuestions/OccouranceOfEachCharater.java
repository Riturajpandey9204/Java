package StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class OccouranceOfEachCharater {
    public static void main(String[] args) {
        String str = "Apple";
        char[] arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (Character c : arr){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
