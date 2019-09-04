package ca.monor.staticDemo01;

public class Student {
    private String name;
    private int age;
    private int sid;
    public static int numberOfStudents = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudents;
    }

    public void show() {
        System.out.println("Student name: " + name + ", age: " + age + ", sid: " + sid);
    }

    public static void showNumber() {
        System.out.println("num : " + numberOfStudents);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sid=" + sid +
                '}';
    }
}
