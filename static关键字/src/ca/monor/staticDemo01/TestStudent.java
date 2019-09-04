package ca.monor.staticDemo01;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Jamse1", 22);
        Student student2 = new Student("Jamse2", 23);
        Student student3 = new Student("Jamse3", 24);
        Student student4 = new Student("Jamse4", 25);
        System.out.println(Student.numberOfStudents);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


    }
}
