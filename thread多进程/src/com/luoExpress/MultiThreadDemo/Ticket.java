package com.luoExpress.MultiThreadDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int tickets = 1000;
    private boolean flag = true;
    private Lock newLock = new ReentrantLock();

    @Override
    public void run() {
        while (flag) {
//            sellTicket();
            newLock.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " is Selling " + tickets--);
            } else {
                flag = false;
            }
            newLock.unlock();
        }
    }

    public synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + " is Selling " + tickets--);
//        } else {
//            flag = false;
//        }
    }
}