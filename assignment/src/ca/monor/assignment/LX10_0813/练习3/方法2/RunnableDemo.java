package ca.monor.assignment.LX10_0813.练习3.方法2;

public class RunnableDemo implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
