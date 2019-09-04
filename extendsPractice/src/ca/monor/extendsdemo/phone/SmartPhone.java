package ca.monor.extendsdemo.phone;

/**
 * this 指代本类对象自己
 * super 指代父类对象
 */
public class SmartPhone extends Phone {
    public SmartPhone(String keyboard, String camera, String battery) {
        super(keyboard, camera, battery);
    }

    public void game() {
        System.out.println("SmartPhone Gaming");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("FaceTime Calling....");
    }
}
