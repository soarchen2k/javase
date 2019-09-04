package ca.monor.assignment.LX_10;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 四、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
 * 并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
 */
public class 练习4_Collection集合集合转数组 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            collection.add(i);
        }
        Object[] array = collection.toArray();
        for (Object o : array
        ) {
            System.out.println(o);
        }
    }
}
