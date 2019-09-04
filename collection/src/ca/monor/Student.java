package ca.monor;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student : " +
                "name : " + name + '\'' +
                ", age : " + age + '\n';
    }

    public static Student[] ageRank(Student[] students) {
        Arrays.sort(students, new AgeComparator());
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i] + ", ");
//        }
        return students;
    }
}
