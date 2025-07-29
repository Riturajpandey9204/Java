package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class EmpCount {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101,"Amit", 50000.00, "IT"),
                new Employee(102,"Rahul", 55000.00, "Finance"),
                new Employee(103,"Rohan", 60000.00, "IT"),
                new Employee(104,"Sohan", 70000.00, "HR")

        );
        Long count = employeeList.stream().count();
        System.out.println("There are total " + count + " employees.");
    }
}
