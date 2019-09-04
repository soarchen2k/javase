package ca.monor.assignment.LX_9;

import java.util.ArrayList;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        String today = getDate().toString(); // get date and time
        printDate(toArrayList(today));
    }

    public static Date getDate() {
        Date date = new Date();
        return date;  //Fri Aug 09 23:38:48 EDT 2019

    }

    public static ArrayList<String> toArrayList(String today) {
        String[] dates = today.split(" ");
        ArrayList<String> newDate = new ArrayList<>();
        newDate.add(dates[5]);
        newDate.add(dates[1]);
        newDate.add(dates[2]);
        newDate.add(dates[3]);
        return newDate;
    }

    public static void convertMonth(ArrayList<String> newDate) {
        switch (newDate.get(1)) {
            case "Jan":
                newDate.set(1, "01");
                break;
            // 中间月份略过
            case "Aug":
                newDate.set(1, "08");
                break;

            case "Sep":
                newDate.set(1, "09");
                break;

            default:
                break;
        }
    }

    public static void printDate(ArrayList<String> newDate) {
        convertMonth(newDate);
        String newDates = newDate.get(0) + "-"
                + newDate.get(1) + "-" + newDate.get(2) +
                " " + newDate.get(3);
        System.out.println(newDates);
    }
}

