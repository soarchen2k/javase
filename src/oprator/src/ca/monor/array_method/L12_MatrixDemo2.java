package oprator.src.ca.monor.array_method;

import java.util.Random;

public class L12_MatrixDemo2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
