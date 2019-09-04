package ca.monor.extendsinterface;

public interface FInterface {
    public abstract void fun1(); // abstract 可以不写

    public default void show() {
        System.out.println("This is FInterface show");
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
