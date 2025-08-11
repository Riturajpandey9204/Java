package DesignPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.getName();
        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.getName();
        Employee e3 = EmployeeFactory.getEmployee(new ManagerDevFac());
        e3.getName();
    }
}
