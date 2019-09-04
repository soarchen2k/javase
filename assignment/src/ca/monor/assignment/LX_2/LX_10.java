package ca.monor.assignment.LX_2;

import java.util.Random;

public class LX_10 {
    public static void main(String[] args) {
        add();
        sub();
        mul();
        div();
        remain();

    }

    public static void add() {

        int a = randomNumber();
        int b = randomNumber();

        show(a, b);
        System.out.println("a - b = " + (a + b));
    }

    public static void sub() {

        int a = randomNumber();
        int b = randomNumber();

        show(a, b);
        System.out.println("a - b = " + (a - b));

    }

    public static void mul() {

        int a = randomNumber();
        int b = randomNumber();

        show(a, b);
        System.out.println("a x b = " + (a * b));
    }

    public static void div() {


        int a = randomNumber();
        int b = randomNumber();

        if (b == 0) {
            System.out.println("Number B is 0, System Error");
            return;
        }

        show(a, b);
        System.out.println("a / b = " + (float) (a / b));
    }

    public static void remain() {

        int a = randomNumber();
        int b = randomNumber();

        show(a, b);
        System.out.println("a % b = " + (a % b));
    }

    public static int randomNumber() {
        Random num = new Random();
        int randomNum = num.nextInt(10000);
        return randomNum;
    }

    public static void show(int num1, int num2) {
        System.out.println("a = " + num1);
        System.out.println("b = " + num2);
    }
}
