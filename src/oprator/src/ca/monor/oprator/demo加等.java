package oprator.src.ca.monor.oprator;

public class demo加等 {
    public static void main(String[] args) {
        short a = 1;
        a += 1;
        a = (short) (a + 1);
        System.out.println(a);
    }
}

/*
        a+=1;
        a = (short) (a+1);
        两种方式等价
 */