package oprator.src.ca.monor.oprator;

public class demoObject {
    public static void main(String[] args) {
        int a = 10;
        double d = 100.10;
        boolean b = true;
        char ch = 'a';
        long l = 100000l;
        show(a);
        show(b);
        show(ch);
        show(d);
        show(l);
    }

    // Object 是所有 class 的 super class    interface
    public static void show(Object object) {
        System.out.println(object);
    }
}
