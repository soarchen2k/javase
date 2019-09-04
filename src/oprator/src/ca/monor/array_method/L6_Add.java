package oprator.src.ca.monor.array_method;

import java.util.Scanner;

/**
 * OverLoad Method
 * define a function "add"
 * 2 nums support int double, 3 nums double long int, 4 nums long
 */

public class L6_Add {
    public static void main(String[] args) {
        System.out.println("Please input 2 numbers, int and double : ");
        int num1 = new Scanner(System.in).nextInt();
        double num2 = new Scanner(System.in).nextDouble();
        add(num1, num2);

        System.out.println("Please input 4 numbers, long : ");
        long num3 = new Scanner(System.in).nextLong();
        long num4 = new Scanner(System.in).nextLong();
        long num5 = new Scanner(System.in).nextLong();
        long num6 = new Scanner(System.in).nextLong();
        add(num3, num4, num5, num6);


    }

    public static void add(int a, double b) {
        double sum = a + b;
        System.out.println("a + b = " + sum);
    }

    public static void add(double a, long b, int c) {
        double sum = a + b + c;
        System.out.println("a+b+c = " + sum);

    }

    public static void add(long a, long b, long c, long d) {
        long sum = a + b + c + d;
        System.out.println("a+b+c+d = " + sum);
    }
}
