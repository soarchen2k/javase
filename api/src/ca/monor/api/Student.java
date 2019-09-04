package ca.monor.api;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int grades;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grades=" + grades +
                '}';
    }

    public static Student[] gradeRank(Student[] students) {
        // 参数1：待比较的容器
        // 参数2：比较器，用于定义比较规则
        Arrays.sort(students, new GradeComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", ");
        }
        return students;
    }

    public static Student[] ageRank(Student[] students) {
        Arrays.sort(students, new AgeComparator());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", ");
        }
        return students;
    }

    public Student(String name, int age, int grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
