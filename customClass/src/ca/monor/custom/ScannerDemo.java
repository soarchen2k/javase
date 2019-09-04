package ca.monor.custom;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
//        int[] arraySum = new int[2];
        ScannerDemo scannerDemo = new ScannerDemo();
        int[] userInput = scannerDemo.getUserInput();
        System.out.println(scannerDemo.addSum(userInput));
    }

    public int[] getUserInput() {
        int[] arraySum = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        arraySum[0] = Integer.parseInt(scanner.nextLine());
        arraySum[1] = Integer.parseInt(scanner.nextLine());
        return arraySum;
    }

    public int addSum(int[] arraySum) {
        if (arraySum == null) {
            return Integer.MIN_VALUE;
        } else if (arraySum.length > 2 || arraySum.length < 1) {
            System.out.println("error");
            return Integer.MAX_VALUE;
        }
        return arraySum[0] + arraySum[1];
    }
}
