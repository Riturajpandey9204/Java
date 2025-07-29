package StringInterviewQuestions;

import java.util.Arrays;

public class SortStringCharacters {
    public static void main(String[] args) {
        String str = "zxyea";
        char[] arr = str.toCharArray();
        char temp;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
             if (arr[i] > arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
            }
        }
        System.out.println(new String(arr));

        //Using sort
        String str1 = "fvnakvmawpedwugrpqeimcdpc";
        char[] charArray = str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
    }
}
