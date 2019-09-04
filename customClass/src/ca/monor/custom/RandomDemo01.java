package ca.monor.custom;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo01 {

    public int getBound() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type bound: ");
        return scanner.nextInt();
    }

    public void printRandomNumber(int bound) {
        Random random = new Random();
        int[] randomNumbers = new int[bound];
        for (int i = 0; i < bound; i++) {
            randomNumbers[i] = random.nextInt(bound + 1);
        }
        for (int ran :
                randomNumbers) {
            System.out.print(ran + " ");
        }
    }


}
