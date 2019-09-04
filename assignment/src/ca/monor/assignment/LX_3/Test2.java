package ca.monor.assignment.LX_3;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        double discount = 1;

        Scanner scanNum = new Scanner(System.in);
        System.out.println("input Price");
        int totalPrice = scanNum.nextInt();

        if (totalPrice < 200) {
            discount = 1;
        } else if (totalPrice >= 200 && totalPrice < 300) {
            discount *= .8;
        } else if (totalPrice >= 300 && totalPrice < 400) {
            discount *= .7;
        } else if (totalPrice >= 400 && totalPrice < 500) {
            discount *= .6;
        } else if (totalPrice >= 500) {
            discount *= .5;
        }

        System.out.println("Total Price = " + totalPrice);
        System.out.println("Final Price = " + totalPrice * discount);

    }
}
