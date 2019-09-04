package com.luoExpress.PoolDemo.Demo3;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tirage1 implements Runnable {
    private Lock newLock = new ReentrantLock();
    private int[] box = new int[]{10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};

    @Override
    public void run() {
        Random random = new Random();
        int i = 0;
        int index;
        boolean flag = true;

        while (true) {
            newLock.lock();
            if (i < 10) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                index = random.nextInt(box.length - i);
                System.out.print(Thread.currentThread().getName() + "产生了 ");
                System.out.println(box[index]);
                if (!(index == box.length - i)) {
                    box[index] = box[box.length - i - 1];
                }
                i++;
            } else {
                flag = false;
            }
            newLock.unlock();
        }
    }

}

//        for (int i = 0; i < box.length; i++) {
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
//            int index = random.nextInt(box.length - i);
//            System.out.print(Thread.currentThread().getName()+"产生了 ");
//            System.out.println(box[index]);
//            if (!(index == box.length - i)) {
//                box[index] = box[box.length - i-1];
//            }
//        }