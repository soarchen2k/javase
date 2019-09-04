package ca.monor.Demo01;

public class BnotInA {
    public static void main(String[] args) {
        int[] arrA = new int[]{3, 4, 8, 12};
        int[] arrB = new int[]{18, 7, 12, 4};

        printBNotInA(arrA, arrB);
    }

    public static void printBNotInA(int[] a, int[] b) {
        for (int value : b) {
            if (bNotInA(value, a)) {
                System.out.print(value + " ");
            }
        }
    }

    private static boolean bNotInA(int b, int[] a) {
        for (int value : a) {
            if (b == value) {
                return false;
            }
        }
        return true;
    }
}