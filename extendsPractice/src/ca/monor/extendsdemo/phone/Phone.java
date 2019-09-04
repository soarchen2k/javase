package ca.monor.extendsdemo.phone;

public class Phone {
    private String keyboard;
    private String camera;
    private String battery;

    public Phone(String keyboard, String camera, String battery) {
        this.keyboard = keyboard;
        this.camera = camera;
        this.battery = battery;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "keyboard='" + keyboard + '\'' +
                ", camera='" + camera + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }

    public void message() {
        System.out.println("Phone Sending a message");
    }

    public void call() {
        System.out.println("Phone Calling.....");
    }
}
