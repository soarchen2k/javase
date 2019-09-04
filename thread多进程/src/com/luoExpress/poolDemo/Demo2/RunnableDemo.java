package com.luoExpress.PoolDemo.Demo2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        MyRunnable myRunnable = new MyRunnable();

    }
}
