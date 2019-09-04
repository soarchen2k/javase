package com.luoExpress.WaitNotify.DemoSourceInputOutputNew;

import java.util.Scanner;

public class Input implements Runnable {
    private Source source;
    Scanner scanner = new Scanner(System.in);

    public Input(Source source) {
        this.source = source;
    }

    @Override
    public void run() {

//        for (int i = 0; i < 2; i++) {
//            System.out.println(Thread.currentThread().getName()+": Type name and sex: ");
//            source.setSource(scanner.nextLine(), scanner.nextLine());
//        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
