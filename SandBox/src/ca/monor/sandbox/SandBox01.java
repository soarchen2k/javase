package ca.monor.sandbox;

import java.util.ArrayList;

public class SandBox01 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int size = 80000000;
        for (int i = 0; i < size; i++) {
            integerArrayList.add(i);
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start = System.currentTimeMillis();
        System.out.println(integerArrayList.contains(size));
        System.out.println(System.currentTimeMillis() - start);
    }
}
