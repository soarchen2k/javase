package com.luoExpress.WaitNotify.DemoProducerCustomer;

public class Clerk {
    private int product = -1;

    public synchronized void setProduct(int product) {
        while (this.product != -1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.product = product;
        System.out.println(Thread.currentThread().getName() + " Producer (%d)%n :" + this.product);
        notify();
    }

    public synchronized int getProduct() {
        while (this.product == -1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Costumer take (%d)%n : " + this.product);
        this.product = -1;
        notify();
        return this.product;
    }
}
