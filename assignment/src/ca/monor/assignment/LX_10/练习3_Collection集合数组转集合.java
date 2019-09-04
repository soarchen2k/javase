package ca.monor.assignment.LX_10;

import java.util.ArrayList;
import java.util.Collection;

public class 练习3_Collection集合数组转集合 {
    public static void main(String[] args) {
        //定义int数组
        int[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = listTest(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> listTest(int[] arr) {
        Collection<Integer> arrayList = new ArrayList<>();
        for (int a : arr) {
            arrayList.add(a);
        }
//        if (arrayList instanceof ArrayList) {
        ArrayList<Integer> newArrayList = (ArrayList<Integer>) arrayList;
        return newArrayList;
//        }

    }
}
