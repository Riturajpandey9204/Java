package StreamsInterviewQuestions;

public class Executive {
    String exName;
    String eEmail;

    public Executive() {
    }

    public Executive(String exName, String eEmail) {
        this.exName = exName;
        this.eEmail = eEmail;
    }

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    @Override
    public String toString() {
        return "Executive{" +
                "exName='" + exName + '\'' +
                ", eEmail='" + eEmail + '\'' +
                '}';
    }
}
