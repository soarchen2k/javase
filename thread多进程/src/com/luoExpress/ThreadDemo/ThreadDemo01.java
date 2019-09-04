package com.luoExpress.ThreadDemo;

public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.start();
        myThread1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main " + i);
        }
    }
}
