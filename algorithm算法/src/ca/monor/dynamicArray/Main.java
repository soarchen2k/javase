package ca.monor.dynamicArray;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            integerArrayList.add(arr[i]);
        }
        System.out.println(integerArrayList);
        integerArrayList.set(4, 35);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.indexOf(35));
    }
}
