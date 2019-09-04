package ca.monor.fib;

public class fibDemo01 {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
