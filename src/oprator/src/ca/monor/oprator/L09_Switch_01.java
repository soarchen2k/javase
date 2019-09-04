package oprator.src.ca.monor.oprator;

import java.util.Scanner;

public class L09_Switch_01 {
    public static void main(String[] args) {
        /**
         * Switch (跳转表) 语句中，使用 break 对该 case 进行跳出
         * default 用于所有 case 都没有满足的情况，否则将进行死循环
         *
         * switch 语句中，数据类型可以是
         * byte, short, int, char, enum (枚举)
         * JDK7 以后可以接收字符串
         *
         * switch 的底层为 if...else if...else if...
         */

        Scanner scanNum1 = new Scanner(System.in);
        System.out.println("Please input week day :");
        int weekday = scanNum1.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("Today is Sunday");
                break;

            case 2:
                System.out.println("Today is Monday");
                break;

            case 3:
                System.out.println("Today is Tuesday");
                break;

            case 4:
                System.out.println("Today is Wednesday");
                break;

            case 5:
                System.out.println("Today is Thursday");
                break;

            case 6:
                System.out.println("Today is Friday");
                break;

            case 7:
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Input error, Input 1 ~ 7");
                break;
        }
    }
}
