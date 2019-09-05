package ca.monor.getMax;

/**
 * 递归 Recursion
 * divide 分制类型递归
 */

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = arrayProduct(500000);

//        int[] arr = {5, 3, 0, 6, 7, 2};
        System.out.println(getMax(arr, 0, arr.length - 1));
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }

    public static int getMax(int[] arr, int left, int right) {
        if (arr.length == 0) {
            return Integer.parseInt(null);
        }
        if (arr.length == 1) {
            return arr[0];
        }

        if (left == right) {
            return arr[left];
        }

        int maxLeft = 0;
        int maxRight = 0;
        int mid = (left + right) / 2;
        maxLeft = getMax(arr, left, mid);
        maxRight = getMax(arr, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    public static int[] arrayProduct(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(10000000);
        }
        return arr;
    }
}
