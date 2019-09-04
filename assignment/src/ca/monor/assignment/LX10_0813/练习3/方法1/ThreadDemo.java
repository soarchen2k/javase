package ca.monor.assignment.LX10_0813.练习3.方法1;

public class ThreadDemo extends Thread {
    public ThreadDemo() {
    }

    public ThreadDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
