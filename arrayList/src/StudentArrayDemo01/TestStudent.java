package StudentArrayDemo01;

public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student student1 = new Student("Cao Cao", 40);
        Student student2 = new Student("Liu Bei", 35);
        Student student3 = new Student("Sun Quan", 30);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println(students.length);

        for (Student s :
                students) {
            System.out.println(s);
        }
    }
}
