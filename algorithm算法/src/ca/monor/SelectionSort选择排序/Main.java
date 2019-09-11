package ca.monor.SelectionSort选择排序;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayProduct(10);
        if (array.length < 2) {
            return;
        }
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                minIndex = array[j] < array[minIndex] ? j : minIndex;
            }
            swap(array, minIndex, i);
        }
        System.out.println();
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int a :
                array) {
            System.out.print(a + " ");
        }
    }

    public static void swap(int[] array, int minIndex, int i) {
        int temp;
        temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
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
