package com.luoExpress.WaitNotify.DemoProducerCustomer;

import java.util.Random;

public class Costumer implements Runnable {
    private Clerk clerk;
    Random random = new Random();

    Costumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Comsumer start to Comsommer");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.getProduct();
        }
    }
}
