package ca.monor.assignment.LX_2;

public class LX_5 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean b1 = false; // = ++a % 3 == 0 && a++ % 7 == 0;
        boolean b2 = false; // = b++ % 3 == 0 && ++b % 7 == 0;

        if (++a % 3 == 0 && a++ % 7 == 0) {
            b1 = true;
        }

        if (b++ % 3 == 0 && ++b % 7 == 0) {
            b2 = true;
        }

        System.out.println(a);
        System.out.println(b1);
        System.out.println(b);
        System.out.println(b2);
    }
}
