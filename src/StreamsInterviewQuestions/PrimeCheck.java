package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class PrimeCheck {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 3,6,45,34,6);
        /*boolean containsPrime = arr.stream().anyMatch(PrimeCheck::isPrime);
        System.out.println(containsPrime);*/
        // Print all prime
        arr.stream().filter(PrimeCheck::isPrime).forEach(System.out::println);
    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i == 0);
            return false;
        }
        return true;
    }
}
