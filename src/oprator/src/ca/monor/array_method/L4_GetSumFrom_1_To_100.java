package oprator.src.ca.monor.array_method;

import java.util.Scanner;

public class L4_GetSumFrom_1_To_100 {
    public static void main(String[] args) {
        System.out.println("Please input range : ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println(sum(num1));
    }

    public static int sum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
