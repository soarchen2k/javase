package com.luoExpress.ThreadDemo;

public class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is doing ! " + i);
            // getName() 获取当前执行线程的名字
        }
    }
}
