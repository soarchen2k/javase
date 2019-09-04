package ca.monor.extendsInterface.laptop;

public class Mouse implements USBInterface {
    public void click() {
        System.out.println("Mouse click");
    }

    @Override
    public void openUSB() {
        System.out.println("Mouse open");
    }

    @Override
    public void closeUSB() {
        System.out.println("Mouse close");
    }
}
