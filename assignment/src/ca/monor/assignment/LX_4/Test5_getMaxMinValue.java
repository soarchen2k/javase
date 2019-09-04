package ca.monor.assignment.LX_4;

import java.util.Random;
import java.util.Scanner;

public class Test5_getMaxMinValue {
    public static void main(String[] args) {

        System.out.println("Please input max or min");
        String maxOrMin = new Scanner(System.in).next();

        int a = getRandNum();
        System.out.println("a = " + a);

        int b = getRandNum();
        System.out.println("b = " + b);

        int c = getRandNum();
        System.out.println("c = " + c);

        getValue(maxOrMin, a, b, c);
    }


    public static void getValue(String str1, int num1, int num2, int num3) {

        switch (str1) {
            case "max":
                int tempNum;
                tempNum = num1 > num2 ? num1 : num2;
                tempNum = tempNum > num3 ? tempNum : num3;
                System.out.println("The " + str1 + " value is : " + tempNum);
                break;

            case "min":
                tempNum = num1 < num2 ? num1 : num2;
                tempNum = tempNum < num3 ? tempNum : num3;
                System.out.println("The " + str1 + " value is : " + tempNum);
                break;

            default:
                System.out.println("Input Error, Please input max or min !");
        }
    }

    public static int getRandNum() {
        int randNum = new Random().nextInt(100000);
        return randNum;
    }
}
