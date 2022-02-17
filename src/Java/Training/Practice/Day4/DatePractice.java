package Java.Training.Practice.Day4;

import Java.Training.Practice.Day3.Specification;

import java.awt.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class DatePractice {
    public static void main(String[] args) {

        Date date = new Date();
        Logger.getGlobal().info(String.valueOf(date));
        //current
        LocalDate localDateTime = LocalDate.now();
        Logger.getGlobal().info(String.valueOf(localDateTime));
        //current
        LocalTime localTime = LocalTime.now();
        Logger.getGlobal().info(String.valueOf(localTime));

        //fromattingDate
        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("dd MMM YYYY");
        String formattedDate = dateFormater.format(localDateTime);
        Logger.getGlobal().info(formattedDate);

        //current
        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));

        //Specific
        Calendar specificCalendar = Calendar.getInstance();
        specificCalendar.set(Calendar.YEAR, 1993);
        specificCalendar.set(Calendar.MONTH, 12);
        specificCalendar.set(Calendar.DAY_OF_MONTH, 7);
        Logger.getGlobal().info(String.valueOf(specificCalendar));













    }
}
