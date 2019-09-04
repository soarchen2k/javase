package ca.monor.assignment.Aug_31.XiaoHeWenTi;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        printSumArray(arr);
    }

    private static void printSumArray(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    sum += arr[j];
                }
            }
        }
        System.out.println(sum);
    }
}
