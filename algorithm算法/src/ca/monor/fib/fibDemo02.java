package ca.monor.fib;

public class fibDemo02 {
    public static void main(String[] args) {
        System.out.println(fib(120));
    }

    public static long fib(long n) {
        long initialA = 0;
        long initialB = 1;
        for (int i = 0; i < n - 1; i++) {
            long fib = initialA + initialB;
            initialA = initialB;
            initialB = fib;
        }
        return initialB;
    }
}
