package ca.monor.assignment.LX_4;

import java.util.Scanner;

public class Test6_printX {
    public static void main(String[] args) {

        System.out.println("Please input lines : ");
        int line = new Scanner(System.in).nextInt();
        printX(line);

    }

    public static void printX(int lineNum) {
// My Code
        for (int i = 1; i <= lineNum; i++) {
            for (int j = 1; j <= lineNum; j++) {
                if (j == i || j + i == lineNum + 1) {
                    System.out.printf("O");
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }

//        // From Answer
//        for (int i = 1; i <= lineNum; i++) {
//            for (int j = 1; j <= lineNum; j++) {
//                if (i == j || i + j == lineNum + 1) {
//                    System.out.print("0");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
    }
}
