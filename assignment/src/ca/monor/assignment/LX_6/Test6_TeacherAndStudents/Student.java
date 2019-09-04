package ca.monor.assignment.LX_6.Test6_TeacherAndStudents;

public class Student {
    private String name;
    private int age;
    private String content;

    public Student(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat() {
        System.out.println("The aged " + age + "'s Student " + name + " is eating......");
    }

    public void study() {
        System.out.println("The aged " + age + "'s Student " + name + content);
    }
}
