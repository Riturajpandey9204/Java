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

    public void seteId(int eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }

    public void seteDeptName(String eDeptName) {
        this.eDeptName = eDeptName;
    }
}
