package StreamsInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

    int eId;
    String eName;
    double eSalary;
    String eDeptName;

    public double geteSalary() {
        return eSalary;
    }

    public String geteDeptName() {
        return eDeptName;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public Employee(int eId, String eName, double eSalary, String eDeptName) {
        this.eId = eId;
        this.eName = eName;
        this.eSalary = eSalary;
        this.eDeptName = eDeptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSalary=" + eSalary +
                ", eDeptName='" + eDeptName + '\'' +
                '}';
    }
    /*List<Employee> employeeList = Arrays.asList(
            new Employee(101,"Amit", 50000.00, "IT"),
            new Employee(102,"Rahul", 55000.00, "Finance"),
            new Employee(103,"Rohan", 60000.00, "IT"),
            new Employee(104,"Sohan", 70000.00, "HR")

    );*/
}
