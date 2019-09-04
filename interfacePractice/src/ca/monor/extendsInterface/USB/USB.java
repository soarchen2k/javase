package ca.monor.extendsInterface.USB;

public class USB implements USBInterface {
    @Override
    public void open() {
        System.out.println("USB is Open");
    }
}
