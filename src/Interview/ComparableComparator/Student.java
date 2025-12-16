package Interview.ComparableComparator;

import java.util.*;

// Define the Student class
class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollno + ": " + name;
    }
}

class SortbyRoll implements Comparator<Student>
{
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}