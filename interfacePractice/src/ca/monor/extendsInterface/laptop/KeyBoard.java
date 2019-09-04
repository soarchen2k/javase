package ca.monor.extendsInterface.laptop;

public class KeyBoard implements USBInterface {
    public void Strike() {
        System.out.println("KeyBoard Strike");
    }

    @Override
    public void openUSB() {
        System.out.println("Keyboard open");
    }

    @Override
    public void closeUSB() {
        System.out.println("Keyboard close");
    }
}
