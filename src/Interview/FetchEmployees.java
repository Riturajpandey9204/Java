package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FetchEmployees {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Ritu","Pandey",51000.00),
                new Employee(2,"Rohan","Singh",73000.00),
                new Employee(3,"Ashish","Prakash", 82000.00),
                new Employee(4,"Ritu","Mishra",94000.00),
                new Employee(5,"Roshan","Pandey",65000.00)
        );
        String str = "Ritu";
/*        employeeList.stream().filter(x->x.getEfirstName().equals(str))
                .collect(Collectors.toList()).forEach(System.out::println);*/
        List<Employee> sortedEmpList = employeeList.stream().sorted(Comparator.comparing(Employee::geteSalary).reversed()).collect(Collectors.toList());
        sortedEmpList.forEach(System.out::println);

    }
}
