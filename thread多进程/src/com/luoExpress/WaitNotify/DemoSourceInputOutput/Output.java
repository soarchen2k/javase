package com.luoExpress.WaitNotify.DemoSourceInputOutput;

public class Output extends Source implements Runnable {
    private Source source;

    public Output(Source source) {
        this.source = source;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            source.printSource();
        }
    }
}
