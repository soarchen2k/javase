package ca.monor.oop;

/**
 * 当类方法带 static 关键字时，该方法属于类
 * 当类方法不带 static 时，该方法属于类的对象
 */
public class Student {
    String name;
    String id;
    int age;
    double weight;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void speek() {
        System.out.println("Student " + name + " speaking");
    }

    public void sleep() {
        System.out.println("Student " + name + " sleeping");
    }

    public void run() {
        System.out.println("Student " + name + " running");
    }

    public void study() {
        System.out.println("Student " + name + " studying");
    }
}
