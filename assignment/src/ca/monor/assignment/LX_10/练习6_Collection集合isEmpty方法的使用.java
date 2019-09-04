package ca.monor.assignment.LX_10;

import java.util.ArrayList;

public class 练习6_Collection集合isEmpty方法的使用 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> al) {
        return al.isEmpty();
    }

}
