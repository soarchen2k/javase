package ca.monor.assignment.LX_10;
/**
 * 定义一个方法listTest(ArrayList<String> al, String s)
 * 要求使用contains()方法判断al集合里面是否包含s
 */

import java.util.ArrayList;

public class 练习5_Collection集合contains方法使用 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("it");
        list.add("hello");
        list.add("java");
        System.out.println(listTest(list, "java"));
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        return al.contains(s);
    }

}
