package ca.monor;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Student student1 = new Student("Pascal", 21);
        Student student2 = new Student("Paul", 23);
        Student student3 = new Student("Joe", 25);
        Student student4 = new Student("John", 24);
        Student student5 = new Student("Jean", 22);

        Collection<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

        printStudent(student1);
        printStudent(student2);
        System.out.println(students.size());


    }

    public static void printStudent(Student student) {
        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
    }

}
