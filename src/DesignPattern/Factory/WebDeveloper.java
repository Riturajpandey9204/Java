package DesignPattern.Factory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Web Developer Salary : ");
        return 250000;
    }
}
