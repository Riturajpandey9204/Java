package StringInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "JAVADeveloper";
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()){
            if(seen.contains(ch)){
                System.out.println("First repeated character is : " + ch);
                return;
            }
            else {
                seen.add(ch);
            }
        }
        System.out.println("None repeated");
    }
}
