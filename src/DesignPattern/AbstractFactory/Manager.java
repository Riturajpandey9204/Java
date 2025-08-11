package DesignPattern.AbstractFactory;

public class Manager implements Employee{
    @Override
    public int getSalary() {
        return 0;
    }

    @Override
    public String getName() {
        System.out.println("I am a manager");
        return "";
    }
}
