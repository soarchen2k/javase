package ca.monor.assignment.LX10_0813.练习3.方法2;

public class RunnableTest {
    public static void main(String[] args) {
        RunnableDemo runnable = new RunnableDemo();
        Thread thread = new Thread(runnable, "Sub Thread");
        thread.start();
        System.out.println("Main Thread");
    }
}
