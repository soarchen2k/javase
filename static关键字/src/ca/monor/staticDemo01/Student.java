package ca.monor.staticDemo01;

/**
 * 关键字 static，声明一个静态类、静态方法或静态属性
 * static 所修饰的内容，随着类的加载而在内存中加载，且只加载一次。
 * 储存在一块固定的内存区域：静态区(static)，优先于对象存在，所以可以被所有对象共享
 *
 * 静态类：
 * 静态方法：是属于类的方法，无法通过对象来访问，只能通过类名来访问静态方法
 * 静态属性：属于类的属性，所有对象共享同一个 static 属性，每一个类对象都可以操作 static 属性，
 * 也可以不建立对象，直接通过类来操作 static 属性
 */
public class Student {
    private String name;
    private int age;

    //为每个学生分配唯一的 SID
    private int sid;
    //学生的总数，通过学生的总数来分配学号
    private static int numberOfStudents = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudents;
    }

    void show() {
        System.out.println("Student name: " + name + ", age: " + age + ", sid: " + sid);
    }

    // numberOfStudents 为static 属性，其对应的 get 方法最好为 static 方法
    static int getNumberOfStudents() {
        return numberOfStudents;
    }

    static void showNumber() {
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
