package ca.monor.assignment.LX_2;

import java.util.Scanner;

public class LX_4 {
    public static void main(String[] args) {

        /**
         * 随机数判断奇偶
         */
//        Random ran1 = new Random();
//        Random ran2 = new Random();
//        Random ran3 = new Random();
//        Random ran4 = new Random();
//
//        int a1 = ran1.nextInt(10000);
//        int a2 = ran2.nextInt(10000);
//        int a3 = ran3.nextInt(10000);
//        int a4 = ran4.nextInt(10000);

        /**
         * 键盘输入数据判断奇偶
         */

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        Scanner num4 = new Scanner(System.in);
        System.out.println("Plz input 4 numbers, separer par Enter : ");

        int a1 = num1.nextInt();
        int a2 = num2.nextInt();
        int a3 = num3.nextInt();
        int a4 = num4.nextInt();

        boolean b1 = a1 % 2 == 0;
        boolean b2 = a2 % 2 == 0;
        boolean b3 = a3 % 2 == 1;
        boolean b4 = a4 % 2 == 1;

        System.out.println(a1 + " is pair : " + b1);
        System.out.println(a2 + " is pair : " + b2);
        System.out.println(a3 + " is impair : " + b3);
        System.out.println(a4 + " is impair : " + b4);
    }
}
