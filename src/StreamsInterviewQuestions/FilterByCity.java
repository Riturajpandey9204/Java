package StreamsInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int stdId;
    private String stdName;
    private String stdCity;

    // Constructor
    public Student(int stdId, String stdName, String stdCity) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdCity = stdCity;
    }

    // Getters
    public int getStdId() { return stdId; }
    public String getStdName() { return stdName; }
    public String getStdCity() { return stdCity; }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", stdCity='" + stdCity + '\'' +
                '}';
    }
}

public class FilterByCity {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Ravi", "Delhi"),
                new Student(2, "Sita", "Mumbai"),
                new Student(3, "Aman", "Delhi"),
                new Student(4, "Geeta", "Pune")
        );

        String filterCity = "Delhi";

        List<Student> delhiStudents = students.stream()
                .filter(student -> student.getStdCity().equalsIgnoreCase(filterCity))
                .collect(Collectors.toList());

        delhiStudents.forEach(System.out::println);
    }
}
