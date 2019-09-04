package ca.monor.assignment.LX_2;

import java.util.Random;

public class LX_9 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        String str;

//        Scanner num1 = new Scanner(System.in);
//        System.out.println("PLZ Input a number :");

        Random num1 = new Random();
        int num = num1.nextInt(10000);
        str = num % 2 == 0 ? " is pair" : " is impair";
        System.out.println(num + str);

    }
}
