package oprator.src.ca.monor.array_method;

public class L9_ArrayDemoGetMax {
    public static void main(String[] args) {
        int[] arr1 = {5, 15, 2000, 10000, 100, 4000};
        getMax(arr1);

    }

    public static void getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
