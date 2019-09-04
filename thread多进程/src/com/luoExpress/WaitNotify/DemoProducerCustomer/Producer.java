package com.luoExpress.WaitNotify.DemoProducerCustomer;

import java.util.Random;

public class Producer implements Runnable {
    private Clerk clerk;
    Random random = new Random();

    Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("Producer start to make INTEGERS");
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.setProduct(i);
        }
    }
}
