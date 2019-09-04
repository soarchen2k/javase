import StudentArrayListDemo.Student;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        Student student1 = new Student("Zhao Li Ying", 18);
        Student student2 = new Student("Tang Yan", 20);
        Student student3 = new Student("Jing Tian", 25);
        Student student4 = new Student("Liu Yan", 19);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        for (Student s :
                studentArrayList) {
            System.out.println(s);
        }
    }

}
