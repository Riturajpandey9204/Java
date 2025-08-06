package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DepartmentWithMaximumTeachers {
    public static void main(String[] args) {

        List<Teachers> teachersList = Arrays.asList(
                new Teachers("Robin", "Physics",30000.00),
                new Teachers("Bubun" , "Maths",40000.00),
                new Teachers("Sangeeta","Physics" ,50000.00),
                new Teachers("Jayanthi", "Maths",60000.00),
                new Teachers("Subhadeep", "Maths",77000.00),
                new Teachers("Prajakta", "English",80000.00)
        );

        Map<String,Long> teachersMap = teachersList.stream()
                .collect(Collectors.groupingBy(Teachers::gettDeoartment,Collectors.counting()));

        System.out.println(teachersMap);

        Optional<Map.Entry<String, Long>> maxDept = teachersMap.entrySet().stream()
                                                    .max(Map.Entry.comparingByValue());

        System.out.println(maxDept.get());
    }
}
