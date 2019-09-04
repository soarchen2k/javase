package com.luoExpress.PoolDemo.Demo2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyRunnable myRunnable = new MyRunnable(12.8, 37.6);
        MyCallable myCallable = new MyCallable(12.8, 21.5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Object> result = executorService.submit(myCallable);
        double o = (double) result.get();
        System.out.println(o);

        executorService.shutdown();
    }
}
