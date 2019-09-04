package com.luoExpress.ThreadDemo.ThreadDemo02;

public class RunnablePair implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getId() + " "
                        + Thread.currentThread().getName() + " Pair: " + i);
            }
        }
    }

    public void runImpair() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getId() + " "
                        + Thread.currentThread().getName() + " Impair : " + i);
            }
        }
    }
}
