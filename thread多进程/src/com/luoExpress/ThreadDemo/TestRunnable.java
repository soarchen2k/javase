package com.luoExpress.ThreadDemo;

public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable task01 = new MyRunnable();
        MyRunnable2 task02 = new MyRunnable2();
        Thread thread01 = new Thread(task02);
        Thread thread02 = new Thread(task01);
        thread01.start();
        thread02.start();
    }
}
