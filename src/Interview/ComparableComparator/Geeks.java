package Interview.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Geeks
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));

        Collections.sort(students, new SortbyRoll());

        System.out.println("Sorted by Roll Number ");

        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }
}
