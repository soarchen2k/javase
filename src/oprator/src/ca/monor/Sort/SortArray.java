package oprator.src.ca.monor.Sort;

import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        generateNewArray();
        int[] arr = generateNewArray();
        System.out.println("New Array:");
        showArr(arr);
        sortArr(arr);
        System.out.println();
        System.out.println("Sorted");
        showArr(arr);
    }

    private static int[] generateNewArray() {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void showArr(int[] arr) {
        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }
}
