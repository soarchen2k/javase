package ca.monor.custom;

import java.util.Scanner;

/**
 * input a bound from user
 * eg. input = 10
 * get: 10*9*8*7...*2*1
 */
public class ScannerDemo2 {


    public int getInputBound() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number : ");
        return Integer.parseInt(scanner.nextLine());
    }

    public long jieCheng(int userBound) {
        long produit = 1;
        for (int i = 1; i <= userBound; i++) {
            produit *= i;
        }
        return produit;
    }
}
