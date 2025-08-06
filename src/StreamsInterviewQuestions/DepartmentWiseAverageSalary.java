package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentWiseAverageSalary {
    public static void main(String[] args) {
        List<Teachers> teachersList = Arrays.asList(
                new Teachers("Robin", "Physics",30000.00),
                new Teachers("Bubun" , "Maths",40000.00),
                new Teachers("Sangeeta","Physics" ,50000.00),
                new Teachers("Jayanthi", "Maths",60000.00),
                new Teachers("Subhadeep", "Maths",77000.00),
                new Teachers("Prajakta", "English",80000.00)
        );
        Map<String ,Double> map = teachersList.stream()
                .collect(Collectors.groupingBy(Teachers::gettDeoartment, Collectors.averagingDouble(Teachers::gettSalary)));

        map.forEach((dept,sal)-> System.out.println(dept + " " + sal));

    }
}
