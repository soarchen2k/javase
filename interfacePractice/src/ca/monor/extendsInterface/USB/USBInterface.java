package ca.monor.extendsInterface.USB;

public interface USBInterface {
    public void open();

    public default void flash() {
        System.out.println("UBS flashing");
    }

    public default void show(int[] arr) {
        for (int a : arr
        ) {
            System.out.println(a);
        }
    }

    public static void showInfo() {
        System.out.println("Static Method");
    }
}
