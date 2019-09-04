package com.luoExpress.ThreadDemo.ThreadDemo02;

/**
 * 2个线程
 * 线程1 打印所有的奇数
 * 线程2 打印所有的偶数
 * 要求：用 runnable 写
 */
public class Test {
    public static void main(String[] args) {
        RunnablePair runnablePair = new RunnablePair();
        RunnableImpair runnableImpair = new RunnableImpair();
        Thread thread1 = new Thread(runnablePair, "T1");
        Thread thread2 = new Thread(runnableImpair, "T2");
        thread1.start();
        thread2.start();
    }
}