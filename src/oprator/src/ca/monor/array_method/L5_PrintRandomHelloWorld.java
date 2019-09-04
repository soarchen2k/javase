package oprator.src.ca.monor.array_method;

import java.util.Random;

public class L5_PrintRandomHelloWorld {
    public static void main(String[] args) {
        int printTimes = new Random().nextInt(10);
        System.out.println(printTimes);
        printHelloWorld(printTimes);
    }

    public static void printHelloWorld(int inputTimes) {
        int printTimesMethod = inputTimes;
        for (int i = 1; i <= printTimesMethod; i++) {
            System.out.println("The " + i + " Time Hello World !");
        }
    }

}
