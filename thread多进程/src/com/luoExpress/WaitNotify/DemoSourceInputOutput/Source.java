package com.luoExpress.WaitNotify.DemoSourceInputOutput;

public class Source {
    private String name;
    private String sex;
    private boolean flag = false;

    public Source() {
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
        }
        System.out.println(Thread.currentThread().getName() + " Name and Sex set Completed");
        notify();
        flag = true;
    }
}
