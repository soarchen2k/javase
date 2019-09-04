package oprator.src.ca.monor.array_method;

import java.util.Scanner;

public class L3_MethodDemo {
    public static void main(String[] args) {
        System.out.println("Please input 2 numbers : ");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(num1 + " and " + num2 + (comparer(num1, num2) ? " is egale" : " not egale"));

    }

    public static boolean comparer(int a, int b) {
        boolean egale = a == b ? true : false;
        return egale;
    }
}
