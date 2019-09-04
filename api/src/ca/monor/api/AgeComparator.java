package ca.monor.api;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o2.getAge() - o1.getAge());
    }
}
