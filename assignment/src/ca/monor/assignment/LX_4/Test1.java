package ca.monor.assignment.LX_4;

public class Test1 {
    public static void main(String[] args) {
        int a = 10, b = 10;

        printNum(a, b);
        doubling(a, b);
        printNum(a, b);
        System.out.println("*************************");
        a = doubling(a);
        b = doubling(b);
        printNum(a, b);

    }

    public static void doubling(int r, int p) {
        r *= 2;
        p *= 2;
        printNum(r, p);
    }

    public static int doubling(int r) {
        r *= 2;
        return r;
    }

    public static void printNum(int iVar, int iVar2) {
        System.out.println("iVar = " + iVar + " iVar2 = " + iVar2);
    }
}
