package ca.monor.oop;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name = "James";
        student1.id = "ab123";
        student1.age = 23;
        student1.weight = 65.4;

        student2.name = "John";
        student2.id = "ab124";
        student2.age = 22;
        student2.weight = 55.8;

        student1.run();
        student1.speek();
        student1.study();
        student1.sleep();
        student2.run();

        System.out.println(student1);
    }
}
