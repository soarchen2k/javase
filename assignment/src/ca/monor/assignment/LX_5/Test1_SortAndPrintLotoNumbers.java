package ca.monor.assignment.LX_5;

import java.util.Arrays;
import java.util.Random;

public class Test1_SortAndPrintLotoNumbers {
    public static void main(String[] args) {

        int[] lotoNumber = new int[10];

        for (int i = 0; i < lotoNumber.length; i++) {
            lotoNumber[i] = getRandomNumber(); // 为乐透号码赋值为随机数
        }
        sortLotoArray(lotoNumber);
    }

    private static int getRandomNumber() { // 随机产生中奖号码
        int ranNum = new Random().nextInt(100);
        return ranNum;
    }

    public static void sortLotoArray(int[] arr) {
        int[] arrLoto = arr;
        Arrays.sort(arrLoto); //sort LOTO numbers

        for (int i = 0; i < arrLoto.length - 1; i++) {
            if (arrLoto[i] == arrLoto[i + 1]) {
                System.out.println("Invalid Loto Number, Please redo"); // 如果中奖号码中有重复的，结果无效
                return;
            }
        }
        System.out.println("Loto Numbers are : ");
        for (int j = 0; j < arrLoto.length; j++) {
            System.out.printf(arrLoto[j] + " "); // 按照升序打印中奖号码
        }


    }
}
