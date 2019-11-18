package ca.monor.staticDemo01;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Jamse1", 22));
        students.add(new Student("Jamse2", 32));
        students.add(new Student("Jamse3", 25));
        students.add(new Student("Jamse4", 27));
        Student.showNumber();
        System.out.println(Student.getNumberOfStudents());

        for (Student s : students) {
            s.show();
        }
    }
}
