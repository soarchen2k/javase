package ca.monor.fastdemo;

import java.util.Random;

public class demo数值类型转换 {
    public static void main(String[] args) {
//        定义一个 double 100.24
//        sout
//        modify 100
//        modify char
//        sout
//        char >> double
        double num1 = 100.24;
        System.out.println(num1);
        num1 = 100; // int >> double
        System.out.println(num1);
//        强制类型转换
        char ch1 = (char) num1;
        System.out.println(ch1);
        num1 = ch1;
        System.out.println(num1);

        double d = 100.23;
        int c = (int) d; // 强制类型转换, 风险
        System.out.println(c);

        Random ran1 = new Random();
        int ranNum1 = ran1.nextInt(100000);
        System.out.println(ranNum1);
        double d4 = (double) ranNum1 / 100;
        double d5 = d4 * 100;
        System.out.println(d4);
        System.out.println(d5);
        System.out.println((int) d5);


    }
}
