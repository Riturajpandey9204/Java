package DesignPattern.AbstractFactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int getSalary() {
        return 150000;
    }

    @Override
    public String getName() {
        System.out.println("I am a Android Developer");
        return "I am a Android Developer";
    }
}
