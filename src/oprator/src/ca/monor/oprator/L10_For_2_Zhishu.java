package oprator.src.ca.monor.oprator;

import java.util.Random;

public class L10_For_2_Zhishu {
    public static void main(String[] args) {


//        isPrimeNumber();
//
//        int num1 = 9;
//
//        for (int i = 2; i < num1; i++)
//            if (num1 % i == 0) {
//                System.out.println(num1 + " is not Prime");
//                return;
//            } else {
//                System.out.println(num1 + " is  Prime");
//                return;
//
//            }
//
//        Random randNum = new Random();
//        int num1 = randNum.nextInt(100);
        for (int i = 2; i < 235842651; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is Prime");
            }
//            System.out.println(isPrime(i) ? i + " is Prime" :i +  " is not Prime");
        }


    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static void isPrimeNumber() {
//        for (int i = 2; i <= 100; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    System.out.println(i + " is not Prime");
//                    break;
//                } else {
//                    System.out.println(i + " is Prime");
//                    break;
//                }
//            }
//        }
//    }
}
