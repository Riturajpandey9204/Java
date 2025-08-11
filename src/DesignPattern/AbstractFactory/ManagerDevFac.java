package DesignPattern.AbstractFactory;

public class ManagerDevFac extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Manager();
    }
}
