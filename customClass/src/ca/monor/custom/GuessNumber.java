package ca.monor.custom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public int getNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public void play(int randomNumber) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess the number: ");
            int guessNumber = scanner.nextInt();
            if (guessNumber < randomNumber) {
                System.out.println("The number is greater than you typed");
            } else if (guessNumber > randomNumber) {
                System.out.println("The number is smaller than you typed");
            } else {
                System.out.println("You got the number !");
                break;
            }
        }
    }
}
