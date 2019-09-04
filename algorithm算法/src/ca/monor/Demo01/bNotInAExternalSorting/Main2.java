package ca.monor.Demo01.bNotInAExternalSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        int[] arrA = newArray(500000);
        Arrays.sort(arrA);
        int[] arrB = newArray(600000);
        Arrays.sort(arrB);

        int[] findBInA = findBInA(arrA, arrB);
//        findBInA(arrA, arrB);
        BRemover(arrB, findBInA);

//        for (int i = 0; i < BRemover(arrB, findBInA(arrA, arrB)).length; i++) {
//            System.out.print(BRemover(arrB, findBInA(arrA, arrB))[i]+" ");
//        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static int[] newArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(1000000);
        }
        return arr;
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
