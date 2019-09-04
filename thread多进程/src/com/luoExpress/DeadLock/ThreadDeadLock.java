package com.luoExpress.DeadLock;

import java.util.Random;

public class ThreadDeadLock implements Runnable {
    Random random = new Random();
    int x = random.nextInt(1);

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
                synchronized (MyLock.lockA) {
                    System.out.println(Thread.currentThread().getName() + " if-LockA");
                    synchronized (MyLock.lockB) {
                        System.out.println(Thread.currentThread().getName() + " if-LockB");
                    }
                }
            } else {
                synchronized (MyLock.lockB) {
                    System.out.println(Thread.currentThread().getName() + " else-LockB");
                    synchronized (MyLock.lockA) {
                        System.out.println(Thread.currentThread().getName() + " else-LockB");
                    }
                }
            }
            x++;
        }
    }
}
