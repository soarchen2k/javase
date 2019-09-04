package ca.monor.assignment.LX_4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        String max = new Scanner(System.in).next();
        if (max == "max") {
            int a = 3, b = 5, c = 9;
            int d = a > b ? a : b;
            d = d > c ? d : c;
            System.out.println(d);
        }

    }
}
