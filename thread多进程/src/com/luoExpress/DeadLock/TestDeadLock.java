package com.luoExpress.DeadLock;

public class TestDeadLock {
    public static void main(String[] args) {
        ThreadDeadLock threadDeadLock1 = new ThreadDeadLock();
        ThreadDeadLock threadDeadLock2 = new ThreadDeadLock();

        Thread windows1 = new Thread(threadDeadLock1, "DeadLock1");
        Thread windows2 = new Thread(threadDeadLock2, "DeadLOck2");

        windows1.start();
        windows2.start();
    }
}
