package ca.monor.list_链表;

import java.util.stream.IntStream;

public class ArrayListTest {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int size = 80000000;
        IntStream.range(0, size).forEachOrdered(integerArrayList::add);
        System.out.println(System.currentTimeMillis() - start1);

        long start = System.currentTimeMillis();
        System.out.println(integerArrayList.contains(size));
        System.out.println(System.currentTimeMillis() - start);

//        System.out.println(integerArrayList);
//        integerArrayList.set(4, 35);
//        System.out.println(integerArrayList);
//        System.out.println(integerArrayList.indexOf(35));
    }
}
