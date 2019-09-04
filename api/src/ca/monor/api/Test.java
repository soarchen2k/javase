package ca.monor.api;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("a", 27, 85);
        Student student2 = new Student("b", 25, 93);
        Student student3 = new Student("c", 31, 95);
        Student student4 = new Student("d", 23, 90);
        Student student5 = new Student("e", 38, 93);

        Student[] students = {student1, student2, student3, student4, student5};
        System.out.println("----- Age Rank -----");
        Student.ageRank(students);
        System.out.println("----- Grade Rank -----");
        Student.gradeRank(students);
        System.out.println(students);

    }

}
