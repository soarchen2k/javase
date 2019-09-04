package ca.monor.api;

import java.util.Comparator;

/**
 * Comparator : 接口，用于定义规则，定义一个空泛的比较规则，没有Body
 * GradeComparator ： 具体的实现类，去定义一个我们需要的比较方法
 */

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getGrades() - o2.getGrades());
    }
}
