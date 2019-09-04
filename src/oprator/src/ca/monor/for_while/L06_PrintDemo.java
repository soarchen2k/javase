package oprator.src.ca.monor.for_while;

import java.util.Scanner;

/**
 * Print the following image
 * <p>
 * <p>
 * *
 * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * * * *
 */

public class L06_PrintDemo {
    public static void main(String[] args) {

        System.out.println("Input Row");
        int row = new Scanner(System.in).nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if (i == 4) {
                    break;
                }
                System.out.printf("* ");
            }
            if (i == 4) {
                continue;
            }
            System.out.println();
        }

    }
}
