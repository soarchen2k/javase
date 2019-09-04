package ca.monor.extendsInterface.laptop;

public class Laptop {
    public void run() {
        System.out.println("Laptop run");
    }

    public void powerOff() {
        System.out.println("Laptop PowerOff");
    }

    public void useUSBDevice(USBInterface usbDevice) {
        if (usbDevice instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usbDevice;
            keyBoard.openUSB();
            keyBoard.Strike();
            keyBoard.closeUSB();
        } else if (usbDevice instanceof Mouse) {
            Mouse mouse = (Mouse) usbDevice;
            mouse.openUSB();
            mouse.click();
            mouse.closeUSB();
        }

    }
}
