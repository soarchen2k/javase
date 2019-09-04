package oprator.src.ca.monor.array_method;

import java.util.Scanner;

public class L13_MatrixDemo3y杨辉三角 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type lines : ");
        int line = Integer.parseInt(scanner.nextLine());
        int[][] triangle = new int[line][line];

        if (line < 3) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < i + 1; j++) {
                    triangle[i][j] = 1;
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < i + 1; j++) {
                    triangle[i][j] = 1;
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 2; i < line; i++) {
                triangle[i][0] = 1;
                triangle[i][i] = 1;
                System.out.print(triangle[i][0] + " ");
                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.print(triangle[i][i] + " ");
                System.out.println();
            }
        }

    }
}
