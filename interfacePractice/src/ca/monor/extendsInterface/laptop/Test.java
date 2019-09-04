package ca.monor.extendsInterface.laptop;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        USBInterface usb1 = new Mouse();
        USBInterface usb2 = new KeyBoard();

        laptop.run();
        laptop.useUSBDevice(usb1);
        laptop.useUSBDevice(usb2);
        laptop.powerOff();
    }
}
