package com.luoExpress.MultiThreadDemo;

public class TestSellingTickets {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Ticket ticket = new Ticket(); //Task
        Thread windows1 = new Thread(ticket, "Windows1");
        Thread windows2 = new Thread(ticket, "Windows2");
        Thread windows3 = new Thread(ticket, "Windows3");
//        executorService.submit(windows1);
//        executorService.submit(windows2);
//        executorService.submit(windows3);
//        executorService.shutdown();

        windows1.start();
        windows2.start();
        windows3.start();
    }
}
