package ca.monor.assignment.LX_6.Test6_TeacherAndStudents;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Zhou", 30, " is Teaching JAVA!!!");
        Student student = new Student("Han", 18, " is Learning Java!!!!");
        teacher.eat();
        teacher.teach();
        student.eat();
        student.study();
    }
}
