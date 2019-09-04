package com.luoExpress.poolDemo.Demo1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        com.luoExpress.poolDemo.Demo1.MyRunnable runnable = new com.luoExpress.poolDemo.Demo1.MyRunnable();

        for (int i = 0; i < 10; i++) {
            executorService.submit(runnable);
            executorService.submit(runnable);
            executorService.submit(runnable);
        }
        executorService.shutdown();  // Close pool object
    }
}
