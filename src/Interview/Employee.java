package Interview;

public class Employee {
    int eId;
    String efirstName;
    String eLastName;
    Double eSalary;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEfirstName() {
        return efirstName;
    }

    public void setEfirstName(String efirstName) {
        this.efirstName = efirstName;
    }

    public String geteLastName() {
        return eLastName;
    }

    public void seteLastName(String eLastName) {
        this.eLastName = eLastName;
    }

    public Double geteSalary() {
        return eSalary;
    }

    public void seteSalary(Double eSalary) {
        this.eSalary = eSalary;
    }

    public Employee() {
    }

    public Employee(int eId, String efirstName, String eLastName, Double eSalary) {
        this.eId = eId;
        this.efirstName = efirstName;
        this.eLastName = eLastName;
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", efirstName='" + efirstName + '\'' +
                ", eLastName='" + eLastName + '\'' +
                ", eSalary=" + eSalary +
                '}';
    }
}
