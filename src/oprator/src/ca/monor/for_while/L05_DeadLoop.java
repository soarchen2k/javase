package oprator.src.ca.monor.for_while;

import java.util.Scanner;

/**
 * demo DeadLoop
 * <p>
 * Dead Loop : condition is always true, loop will never stop.
 * ex :
 * while (true){}
 */
public class L05_DeadLoop {
    public static void main(String[] args) {
        // Wait for client input
        /*
        Scanner num = new Scanner(System.in);
        String input = num.next();
        Can Be Write as:
         */

        String input = new Scanner(System.in).next();
        int num = new Scanner(System.in).nextInt();

        while (true) {
            if (input.equals("#")) {
                break;
            }
        }

//        for (;;) {
//            System.out.println("Dead Loop");
//        }
    }
}
