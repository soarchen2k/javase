package ca.monor.api.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Student student1 = new Student("a", 18, 89, 62.31, 168.65);
        Student student2 = new Student("b", 17, 93, 62.39, 168.62);
        Student student3 = new Student("c", 19, 90, 62.37, 168.61);
        Student student4 = new Student("d", 18, 92, 62.33, 168.69);
        Student student5 = new Student("e", 17, 91, 62.34, 168.64);

//        Student[] students = {student1, student2, student3, student4, student5};

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------Height Rank--------------------");
        Student.printHeightRank(students);

        System.out.println("----------------Reverse Students--------------------");
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------Weight Rank-------------------");
        Student.printWeightRank(students);

        System.out.println("-----------------Grade Rank-------------------");
        Student.printGradeRank(students);

        System.out.println("------------------Age Rank------------------");
        Student.printAgeRank(students);
        System.out.println("------------------Name Rank------------------");
        Student.printNameRank(students);
    }
}
