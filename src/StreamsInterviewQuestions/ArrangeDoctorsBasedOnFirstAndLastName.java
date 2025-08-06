package StreamsInterviewQuestions;

import javax.print.Doc;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeDoctorsBasedOnFirstAndLastName {
    public static void main(String[] args) {

        List<Doctors> doctorsList = Arrays.asList(
                new Doctors("Rohan" , "Suryavanshi"),
                new Doctors("Ritu", "Pandey"),
                new Doctors("Adam", "Rich"),
                new Doctors("Adam", "Smith")
        );
        doctorsList.stream().sorted(Comparator.comparing(Doctors::getFirstName)
                .thenComparing(Doctors::getLastName))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
