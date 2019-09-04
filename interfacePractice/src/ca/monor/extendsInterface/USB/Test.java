package ca.monor.extendsInterface.USB;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        USB usb = new USB();
        usb.open();
        usb.flash();
        int[] arr = IntStream.range(0, 5).toArray();
        usb.show(arr);
        USBInterface.showInfo();
    }
}
