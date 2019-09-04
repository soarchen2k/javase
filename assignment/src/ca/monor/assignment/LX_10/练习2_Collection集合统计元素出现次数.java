package ca.monor.assignment.LX_10;

import java.util.ArrayList;
import java.util.Collection;

public class 练习2_Collection集合统计元素出现次数 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:" + listTest(list, "a"));
        System.out.println("b:" + listTest(list, "b"));
        System.out.println("c:" + listTest(list, "c"));
        System.out.println("xxx:" + listTest(list, "xxx"));
    }

    public static int listTest(Collection<String> list, String s) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list instanceof ArrayList) {
                ArrayList<String> arrayList = (ArrayList<String>) list;
                if (arrayList.get(i).equals(s)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
