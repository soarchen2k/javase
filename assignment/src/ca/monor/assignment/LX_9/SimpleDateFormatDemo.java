package ca.monor.assignment.LX_9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateSDF = new SimpleDateFormat("yyyy年MM月dd");
        Date date;

        String dateString = "2019-08-05";
        date = dateSDF.parse(dateString);
        System.out.println(date);

    }
}
