package StreamsInterviewQuestions;

public class Teachers {
    String tName;
    String tDeoartment;
    Double tSalary;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDeoartment() {
        return tDeoartment;
    }

    public void settDeoartment(String tDeoartment) {
        this.tDeoartment = tDeoartment;
    }

    public Double gettSalary() {
        return tSalary;
    }

    public void settSalary(Double tSalary) {
        this.tSalary = tSalary;
    }

    public Teachers(String tName, String tDeoartment, Double tSalary) {
        this.tName = tName;
        this.tDeoartment = tDeoartment;
        this.tSalary = tSalary;
    }
}
