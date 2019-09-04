package ca.monor.api.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int grade;
    private double weight;
    private double height;

    public Student() {
    }

    public Student(String name, int age, int grade, double weight, double height) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.weight = weight;
        this.height = height;
    }

    public static void printAgeRank(ArrayList<Student> o) {
        o.sort(Comparator.comparing(Student::getAge));
        for (Student student : o) {
            System.out.println(student);
        }
    }

    public static void printNameRank(ArrayList<Student> o) {
        o.sort(Comparator.comparing(Student::getName));
        for (Student student : o) {
            System.out.println(student);
        }
    }

    public static void printGradeRank(ArrayList<Student> o) {
        o.sort(Comparator.comparing(Student::getGrade));
        for (Student student : o) {
            System.out.println(student);
        }
    }

    public static void printWeightRank(ArrayList<Student> o) {
        o.sort(Comparator.comparing(Student::getWeight));
        for (Student student : o) {
            System.out.println(student);
        }
    }

    public static void printHeightRank(ArrayList<Student> o) {
        o.sort(Comparator.comparing(Student::getHeight));
        for (Student student : o) {
            System.out.println(student);
        }
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                grade == student.grade &&
                Double.compare(student.weight, weight) == 0 &&
                Double.compare(student.height, height) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade, weight, height);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
