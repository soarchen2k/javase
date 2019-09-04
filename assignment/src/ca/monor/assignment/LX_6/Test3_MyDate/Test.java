package ca.monor.assignment.LX_6.Test3_MyDate;

public class Test {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1900, 1, 1);
        myDate.showDate();
        myDate.isBi();
        myDate.setYear(2015);
        myDate.isBi();
        myDate.setYear(2000);
        myDate.isBi();
    }
}
