package ca.monor.oop;

/**
 * this 用来区分自己和非己，用来标记成员变量
 */
public class Person {
    // 成员变量私有化
    private String name;
    private int age;
    private double salary;

    //成员方法公有化

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void work() {
    }

    public String speak(String word) {
        return word;
    }
}
