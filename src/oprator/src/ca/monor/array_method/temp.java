package oprator.src.ca.monor.array_method;

public class temp {
    public static void main(String[] args) {

        int a = 1, b = 2;
        System.out.println(a);
        System.out.println(b);
        change(a, b);
    }

    public static void change(int a, int b) {
        a += b;
        b += a;
        System.out.println(a);
        System.out.println(b);
    }
}
