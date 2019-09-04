package oprator.src.ca.monor.array_method;

import java.util.Scanner;

public class L2_MethodDemo {
    public static void main(String[] args) {
        System.out.println("Please input 2 numbers : ");
        int num1 = new Scanner(System.in).nextInt();
        int num2 = new Scanner(System.in).nextInt();
        System.out.println(getSum(num1, num2));

    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
