package DesignPattern.AbstractFactory;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 250000;
    }

    @Override
    public String getName() {
        System.out.println("I am a web Developer");
        return "I am a web Developer";
    }
}
