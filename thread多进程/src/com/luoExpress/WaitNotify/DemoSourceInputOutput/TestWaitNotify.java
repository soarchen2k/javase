package com.luoExpress.WaitNotify.DemoSourceInputOutput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestWaitNotify {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Source source = new Source();
        Thread thread1 = new Thread(new Input(source), "Inputer");
        Thread thread2 = new Thread(new Output(source), "Outputer");

        thread1.start();
        thread2.start();
    }
}
