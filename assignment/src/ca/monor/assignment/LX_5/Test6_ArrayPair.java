package ca.monor.assignment.LX_5;

public class Test6_ArrayPair {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 2, 1};
        int[] arr3 = {1, 2, 3, 3, 2, 1};
        int[] arr4 = {1, 2, 3, 3, 5, 1}; // Define Array

        printPair(sym(arr1));
        printPair(sym(arr2));
        printPair(sym(arr3));
        printPair(sym(arr4));


    }

    public static boolean sym(int[] arr) {
//        boolean pair = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;  // 判断是否对称
//                break;
            }
        }
        return true;
    }

    public static void printPair(boolean b1) {
        System.out.printf("Array is ");
        System.out.println(b1 ? "PAIR" : "IMPAIR");
    }
}
