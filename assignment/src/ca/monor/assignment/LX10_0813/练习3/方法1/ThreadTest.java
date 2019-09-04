package ca.monor.assignment.LX10_0813.练习3.方法1;

public class ThreadTest {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo("Sub Thread");
        threadDemo.start();
        System.out.println("Main Thread");
    }
}
