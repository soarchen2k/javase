package ca.monor.Demo01.bNotInAExternalSorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 外排法
 * （外部排序法）
 */
public class Main {
    public static void main(String[] args) {
        int[] arrA = new int[]{3, 4, 8, 12};
        int[] arrB = new int[]{18, 7, 12, 4};
        Arrays.sort(arrB);

        for (int i = 0; i < BRemover(arrB, findBInA(arrA, arrB)).length; i++) {
            System.out.print(BRemover(arrB, findBInA(arrA, arrB))[i] + " ");
        }
    }

    private static int[] BRemover(int[] arrB, int[] bInA) {
        ArrayList<Integer> arrayListB = toArrayList(arrB);
        arrayListB.removeAll(toArrayList(bInA));
        return toIntArray(arrayListB);
    }

    private static ArrayList<Integer> toArrayList(int[] arrB) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int value : arrB) {
            arrayList.add(value);
        }
        return arrayList;
    }

    private static int[] findBInA(int[] arrA, int[] arrB) {
        int j = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < arrB.length; i++) {
            while (j < arrA.length) {
                if (arrB[i] == arrA[j]) {
                    arrayList.add(arrB[i]);
                    j++;
                } else if (arrB[i] > arrA[j]) {
                    j++;
                } else break;
            }
        }
        return toIntArray(arrayList);
    }

    private static int[] toIntArray(ArrayList<Integer> arrayList) {
        int[] arr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
