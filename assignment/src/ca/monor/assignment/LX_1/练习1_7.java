package ca.monor.assignment.LX_1;

public class 练习1_7 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c;

        System.out.println("Before :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c = a;
        a = b;
        b = c;


        System.out.println("After :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
