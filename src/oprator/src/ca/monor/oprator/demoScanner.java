package oprator.src.ca.monor.oprator;

import java.util.Scanner;

public class demoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz Input Your Score : ");

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Plz enter your name : ");
        int score = scanner.nextInt();
        String name = scanner1.next();
        System.out.println(score);
        System.out.println(name);


    }
}
