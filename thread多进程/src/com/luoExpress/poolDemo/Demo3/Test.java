package com.luoExpress.PoolDemo.Demo3;

public class Test {
    public static void main(String[] args) {
        Tirage1 tirage1 = new Tirage1();

        Thread t1 = new Thread(tirage1, "BOX1");
        Thread t2 = new Thread(tirage1, "BOX2");

        t1.start();
        t2.start();
    }
}
