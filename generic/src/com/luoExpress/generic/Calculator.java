package com.luoExpress.generic;

import java.util.Scanner;

/**
 * add(E e1, E e2)
 */
public class Calculator<E> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator<Double> calculator = new Calculator<>();

        System.out.print("Please type 2 numbers : ");
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        while (true) {
            System.out.println("Please choose command \n (a = add, s = sub, m = multi, d = div) : ");
            String command = scanner.nextLine();
            switch (command) {
                case "a":
                    System.out.println("add: " + calculator.add(num1, num2));
                    break;

                case "s":
                    System.out.println("sub: " + calculator.sub(num1, num2));
                    break;

                case "m":
                    System.out.println("multi: " + calculator.multi(num1, num2));
                    break;

                case "d":
                    System.out.println("div: " + calculator.div(num1, num2));
                    break;

                case "":
                    return;
            }
        }


    }

    public double add(E e1, E e2) {
        Double aDouble = Double.valueOf(e1.toString());
        Double bDouble = Double.valueOf(e2.toString());
        return aDouble + bDouble;
    }

    public double sub(E e1, E e2) {
        Double aDouble = Double.valueOf(e1.toString());
        Double bDouble = Double.valueOf(e2.toString());
        return aDouble - bDouble;
    }

    public double multi(E e1, E e2) {
        Double aDouble = Double.valueOf(e1.toString());
        Double bDouble = Double.valueOf(e2.toString());
        return aDouble * bDouble;
    }

    public double div(E e1, E e2) {
        Double aDouble = Double.valueOf(e1.toString());
        Double bDouble = Double.valueOf(e2.toString());
        return aDouble / bDouble;
    }
}
