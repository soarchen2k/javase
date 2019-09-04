package com.luoExpress.WaitNotify.DemoProducerCustomer;

public class TestWaitNotify {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Thread producer = new Thread(new Producer(clerk), "Producer");
        Thread costumer = new Thread(new Costumer(clerk), "Costumer");

        producer.start();
        costumer.start();
    }
}
