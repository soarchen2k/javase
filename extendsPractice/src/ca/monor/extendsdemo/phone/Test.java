package ca.monor.extendsdemo.phone;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Nokia", "Zeiss", "Sony");
        System.out.println(phone1);
        phone1.call();
        phone1.message();

        SmartPhone smartPhone1 = new SmartPhone("Noubia", "Nikkor", "Sony");
        System.out.println(smartPhone1);
        smartPhone1.call();
    }

}
