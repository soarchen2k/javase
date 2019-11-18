package ca.monor.staticDemo01;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jamse1", 22));
        students.add(new Student("Jamse2", 32));
        students.add(new Student("Jamse3", 25));
        students.add(new Student("Jamse4", 27));

        System.out.println(Student.getNumberOfStudents());

        for (Iterator<Student> iterator = students.iterator(); iterator.hasNext(); ) {
            Student next = iterator.next();
            System.out.println(next);
        }

    }
}
