package ca.monor.assignment.LX_1;

public class 练习1_4 {
    public static void main(String[] args) {
        byte a1 = -128;
        byte a2 = 127;

        show(a1);
        show(a2);

        short b1 = -32768;
        short b2 = 32767;

        show(b1);
        show(b2);

        int c1 = -2147483648;
        int c2 = 2147483647;

        show(c1);
        show(c2);

        long d1 = -2147483649L;
        long d2 = 2147483648L;
        show(d1);
        show(d2);

        int c3 = 23654789;
        show(c3);

        long d3 = 564114614318431681L;
        show(d3);


//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(d1);
//        System.out.println(d2);

    }

    public static void show(byte num1) {
        System.out.println(num1);
    }

    public static void show(short num2) {
        System.out.println(num2);

    }

    public static void show(int num3) {
        System.out.println(num3);

    }

    public static void show(long num4) {
        System.out.println(num4);

    }
}
