package ca.monor.assignment.Aug_31.XiaoHeWenTi.NiXuDui;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 15, 14, 13, 12, 11};
        printNiXuDui(arr);
    }

    private static void printNiXuDui(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println(arr[i - 1] + ", " + arr[i]);
            }
        }
    }
}
