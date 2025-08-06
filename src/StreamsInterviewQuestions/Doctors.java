package StreamsInterviewQuestions;

public class Doctors {
    String firstName;
    String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Doctors(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Doctors() {
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
