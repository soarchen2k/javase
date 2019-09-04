package com.luoExpress.WaitNotify.DemoSourceInputOutputNew;

public class Source {
    private String name;
    private String sex;
    private boolean flag = false;
    Source source = new Source();
    Source[] sources = new Source[2];

    public Source() {
    }

    public Source(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public synchronized String printSource() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Name : " + this.name + ", Sex : " + this.sex);
        notify();
        flag = false;
        return name;
    }

    public synchronized void setSource(String name, String sex) {
        this.name = name;
        this.sex = sex;
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 2; i++) {
                sources[i] = new Source(name, sex);
            }
        }
        System.out.println(Thread.currentThread().getName() + " Name and Sex set Completed");
        notify();
        flag = true;
    }
}
