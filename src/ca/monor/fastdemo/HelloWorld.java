package ca.monor.fastdemo;

/**
 * @author chongchen
 * @version 1.0
 */

/*
This class is to show a simple demo of java project
 */

public class HelloWorld {
    /**
     * This method is the entrance of whole project
     *
     * @param args a system param
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    /**
     * javadoc 可以帮助我们自动生成说明书
     * This method is to deployment add function
     *
     * @param a is an add num
     * @param b is an other add num
     * @return the sum
     */
    public int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}
