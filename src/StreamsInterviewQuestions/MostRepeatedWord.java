package StreamsInterviewQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\ritur\\Desktop\\Java8Features\\Java8\\src\\StreamsInterviewQuestions\\input.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Read all words into a list
            List<String> words = br.lines().flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.toList());

            // Count frequency of each word
            Map<String ,Long> wordCount = words.stream()
                    .collect(Collectors.groupingBy(x->x,Collectors.counting()));

            // Find the most repeated word
            Map.Entry<String,Long> mostRepeated = wordCount.entrySet().stream()
                    .max(Map.Entry.comparingByValue()).orElse(null);

            if(mostRepeated != null){
                System.out.println("Most repeated word = " + mostRepeated.getKey());
                System.out.println("Count : " + mostRepeated.getValue());
            }else {
                System.out.println("No word found");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
