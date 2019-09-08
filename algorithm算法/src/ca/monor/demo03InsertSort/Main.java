package ca.monor.demo03InsertSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {7, 3, 5, 9, 6};
        long startTime1 = System.currentTimeMillis();
        int[] arr = arrayProduct(10000000);
        System.out.println(System.currentTimeMillis() - startTime1);

        insertSort(arr);
        long startTime2 = System.currentTimeMillis();
        Arrays.sort(arr);
        System.out.println(System.currentTimeMillis() - startTime2);

//        for (int a :
//                arr) {
//            System.out.print(a+" ");
//        }
    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] array, int j, int i) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] arrayProduct(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
