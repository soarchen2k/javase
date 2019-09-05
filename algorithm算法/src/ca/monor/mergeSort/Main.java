package ca.monor.mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 6, 9, 1};
        mergeSort(array);
        for (int i :
                array) {
            System.out.println(i);
        }
    }


    public static void mergeSort(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        mergeSortRecursive(arr, result, 0, length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int[] result, int start, int end) {
        if (start >= end)
            return;
        int len = end - start, mid = (len >> 1) + start;
        int start1 = start, end1 = mid;
        int start2 = mid + 1, end2 = end;
        mergeSortRecursive(arr, result, start1, end1);
        mergeSortRecursive(arr, result, start2, end2);
        int k = start;
        while (start1 <= end1 && start2 <= end2)
            result[k++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
        while (start1 <= end1)
            result[k++] = arr[start1++];
        while (start2 <= end2)
            result[k++] = arr[start2++];
        for (k = start; k <= end; k++)
            arr[k] = result[k];
    }
}