package oprator.src.ca.monor.for_while;

import java.util.Scanner;

/**
 * 等待用户输入一个数字，代表一个范围 (range)
 * 把这个范围内所有的偶数找出来并得到他们的乘积的结果
 * 等待用户下次输入，重复上面的操作，直到用户输入『#』时结束
 */
public class L03_ForWhileDemo {
    public static void main(String[] args) {
        int range = 0;
        while (range != -1) {
            range = input();
            multi(range);
        }
    }

    public static int input() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a num : ");
        int num = new Scanner(System.in).nextInt();
        System.out.println("Range is : " + num);
        return num;
    }

    public static long multi(int range) {
        Long res = 1L;
        if (range == -1) {
            res = 0L;
            System.out.println("res : " + res);
            return 0;
        }

        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                res *= i;
            }
        }
        System.out.println("res : " + res);
        return res;
    }
}
