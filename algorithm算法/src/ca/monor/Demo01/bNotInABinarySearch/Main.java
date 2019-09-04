package ca.monor.Demo01.bNotInABinarySearch;

/**
 * 二分法打印B不在A中的所有数
 */

public class Main {
    public static void main(String[] args) {
        int[] arrA = new int[]{3, 4, 8, 12};
        int[] arrB = new int[]{18, 7, 12, 4};

        printBNotInA(arrA, arrB);
    }

    private static void printBNotInA(int[] arrA, int[] arrB) {
        for (int b : arrB) {
            if (BNotInA(b, arrA)) {
                System.out.print(b + " ");
            }
        }
    }

    private static boolean BNotInA(int b, int[] arrA) {
        int indexStratA = 0;
        int indexEndA = arrA.length - 1;

        while (indexStratA <= indexEndA) {
            int indexMiddleA = (indexEndA + indexStratA) / 2;
            if (b == arrA[indexMiddleA]) {
                return false;
            }
            if (b < arrA[indexMiddleA]) {
                indexEndA = indexMiddleA - 1;
            } else {
                indexStratA = indexMiddleA + 1;
            }
        }
        return true;
    }
}
