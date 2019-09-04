package oprator.src.ca.monor.loop;

import java.util.Random;
import java.util.Scanner;

public class test9_Random {
    public static void main(String[] args) {
        /**
         * 生成随机数并判断奇偶
         */
        Random random1 = new Random();
        Random random2 = new Random();
        int randNum1 = random1.nextInt(10000);
        int randNum2 = random2.nextInt(10000);
        System.out.println("第一个随机数：" + randNum1);
        System.out.println("第二个随机数：" + randNum2);
        int randNum = randNum1 * randNum2;
        printNumber(randNum);

        /**
         * 使用键盘输入数字并判断奇偶
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("PLZ Input Number :");
//        int num = scanner.nextInt();
//        printNum(num);

    }

    public static void printNumber(int num) {
        String str = "数字 :";

        if ((num % 2) == 0 ? true : false) {
            str += num + "是偶数";
            System.out.println(str);
            return;
        }

        str += num + "是奇数";
        System.out.println(str);
    }
}
