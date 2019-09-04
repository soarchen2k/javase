package ca.monor.assignment.LX_6.Test3_MyDate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {
        System.out.println("Year: " + year + " Month: " + month + " Date: " + day);
    }

    public void isBi() {
        System.out.print(year);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" is Leap Year");
        } else {
            System.out.println(" is not Leap Year");
        }
    }
}
