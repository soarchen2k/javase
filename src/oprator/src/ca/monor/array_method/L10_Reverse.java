package oprator.src.ca.monor.array_method;

public class L10_Reverse {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 9, 10, 23};
        int temp;
        int times = arr1.length / 2;
        System.out.println("change times = " + times);

        for (int i = 0; i < times; i++) {
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
