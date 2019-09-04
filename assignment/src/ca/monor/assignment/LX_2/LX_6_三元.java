package ca.monor.assignment.LX_2;

import java.util.Scanner;

public class LX_6_三元 {
    public static void main(String[] args) {
        printNum();

    }

    public static void printNum() {

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        System.out.println("PLEASE INPUT 4 NUMBERS :");

        int a = input1.nextInt();
        int b = input2.nextInt();
        int c = input3.nextInt();
        int d = input4.nextInt();

        int num1 = ++a;
        boolean bo1 = num1 >= 10 ? true : false;
//        System.out.println("bo1 = " + bo1);
        show(a, bo1);

        int num2 = b++;
        boolean bo2 = num2 > 10;
//        System.out.println("bo2 = "+bo2);
        show(b, bo2);

        int num3 = --c;
        boolean bo3 = num3 >= 100;
//        System.out.println("bo3 = " + bo3);
        show(c, bo3);

        boolean bo4 = (++d % 3 == 0 && d++ % 7 == 0);
//        System.out.println("bo4 = " + bo4);
        show(d, bo4);

    }

    public static void show(int num, boolean flag) {
        System.out.println("flag is : " + flag);
        System.out.println("Number is : " + num);
    }

}
