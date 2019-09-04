package oprator.src.ca.monor.loop;

public class demoIF2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        boolean b1 = false;
        boolean b2;

        if ((++a % 3) == 0 && (a++ % 7) == 0) {
            b1 = true;
        }

        show(a, b1);

//        System.out.println("b1 is : "+b1);
//        System.out.println(a);

        if ((b++ % 3) == 0 && (++b % 7) == 0) {
            b2 = true;
        } else b2 = false;

        show(b, b2);

//        System.out.println("b2 is : "+b2);
//        System.out.println(b);

    }

    public static void show(int num, boolean flag) {
        System.out.println("flag is : " + flag);
        System.out.println(num);
    }
}
