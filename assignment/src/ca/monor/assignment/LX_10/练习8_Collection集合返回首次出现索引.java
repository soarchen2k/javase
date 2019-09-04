package ca.monor.assignment.LX_10;

import java.util.ArrayList;

/**
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
 */
public class 练习8_Collection集合返回首次出现索引 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(listTest(list, 5));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        if (al.contains(s)) {
            return al.indexOf(s);
        } else return -1;
    }
}
