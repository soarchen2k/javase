package oprator.src.ca.monor.loop;

import java.util.Random;
import java.util.Scanner;

public class ExcersiceIF {
    public static void main(String[] args) {

/**
 *            aa 和 bb 表示定义的Scanner的变量
 */
        Scanner aa = new Scanner(System.in);
        Scanner bb = new Scanner(System.in);
        Scanner cc = new Scanner(System.in);

        System.out.println("PLZ Input a :");
        System.out.println("PLZ Input b :");
        System.out.println("PLZ Input C :");

        /**
         *         aa.nextInt() 需要跟前面定义的 aa 相一致
         */
        int a = aa.nextInt();
        int b = bb.nextInt();
        int c = cc.nextInt();

//        Random aa = new Random();
//        Random bb = new Random();
//        Random cc = new Random();
//
//        int a = aa.nextInt(10000);
//        int b = bb.nextInt(10000);
//        int c = cc.nextInt(10000);

        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

        if (++a % 3 == 0 && a++ % 7 == 0) {
            b1 = true;
        }
        System.out.println(b1);
        System.out.println(a);

        if (b++ % 3 == 0 && ++b % 7 == 0) {
            b2 = true;
        }
        System.out.println(b2);
        System.out.println(b);

        if (c++ % 3 == 0 && c++ % 7 == 0) {
            b3 = true;
        }

        System.out.println(b3);
        System.out.println(c);
    }
}
