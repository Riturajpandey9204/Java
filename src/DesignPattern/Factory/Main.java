package DesignPattern.Factory;

public class Main {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("WEb");
        System.out.println(employee);
        System.out.print(employee.getSalary());
    }
}
