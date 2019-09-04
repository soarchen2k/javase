package oprator.src.ca.monor.oprator;

import java.util.Scanner;

public class L09_Switch_02 {
    public static void main(String[] args) {
        Scanner scanNum1 = new Scanner(System.in);
        System.out.println("Please Input Date : ");
        String date = scanNum1.next();
        switch (date) {
            case "Sun":
                System.out.println("Today is Sunday");
                break;

            case "Mon":
                System.out.println("Today is Monday");
                break;

            case "Tus":
                System.out.println("Today is Tuesday");
                break;

            case "wed":
                System.out.println("Today is Wednesday");
                break;

            case "Thu":
                System.out.println("Today is Thursday");
                break;

            case "Fri":
                System.out.println("Today is Friday");
                break;

            case "Sat":
                System.out.println("Today is Saturday");
                break;

            default:
                System.out.println("Input error, Input Mon ~ Sat");
                break;
        }
    }
}
