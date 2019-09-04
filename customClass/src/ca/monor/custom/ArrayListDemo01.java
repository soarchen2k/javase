package ca.monor.custom;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //ArrayList 不支持基本类型(Basic Type) 8种
        //需要基本类型的包装类型
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(0, 333);
        arrayList.set(0, 000);
        System.out.println(arrayList);

        // 迭代器
        Iterator<Integer> integerIterator = arrayList.iterator();
        while (integerIterator.hasNext()) {
            System.out.print(integerIterator.next() + " ");
        }
    }
}
