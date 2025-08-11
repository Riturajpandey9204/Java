package DesignPattern.Factory;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Android Developer : ");
        return 150000;
    }
}
