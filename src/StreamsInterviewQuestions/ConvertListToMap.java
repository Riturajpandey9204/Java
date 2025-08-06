package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMap {
    //taking key as city convert list to map for person object.
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Raj" , "Jamshedpur" , 28),
                new Person("Rohan", "Jamshedpur", 29),
                new Person("Payal", "Pune", 28),
                new Person("Saloni", "Banglore", 29),
                new Person("Rajesh", "Kolkata",35)
        );
        personList.stream().collect(Collectors.groupingBy(Person::getCity)).forEach((k,v)-> System.out.println(k + " " + v));
    }
}
