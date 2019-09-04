package ca.monor.assignment.LX_3;

public class Test5 {
    public static void main(String[] args) {
        int jj = 20, a = 0, b = 0;
        for (int ii = 0; ii < jj; ii += 2, jj--) {
            if (ii % 3 == 0) {
                a = ii;
                System.out.println(ii + " Hello");
            } else {
                b = jj;
                System.out.println(jj + " World");
            }
        }
        System.out.println("a*b = " + a + "*" + b + " = " + a * b);
    }
}
