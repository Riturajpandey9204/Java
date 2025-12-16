package SolidPrinciples;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class EYoutput {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble median = numbers.stream().mapToDouble(Integer::intValue)
                .sorted()
                .skip((numbers.size() -1) / 2) // 2
                .limit(numbers.size() % 2 == 0 ? 2 : 1).average(); //3
        System.out.println("Median of the list: " + (median.isPresent() ? median.getAsDouble() : "N/A")); // 3.00
    }
}
