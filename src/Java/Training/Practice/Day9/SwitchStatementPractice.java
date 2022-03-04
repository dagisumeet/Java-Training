package Java.Training.Practice.Day9;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class SwitchStatementPractice {
    public static void main(String[] args) {
       Logger.getGlobal().info("Please enter the day:");
        String today;
        Scanner sc  = new Scanner(System.in);
        today = sc.nextLine();

//        String today = "Saturday";

//        Enhanced Switch statement that is used if JDK 2017.
        switch (today) {
            case "Sunday", "Friday" -> Logger.getGlobal().info("Holiday");
            case "Monday" -> Logger.getGlobal().info("Monday");
            case "Tuesday" -> Logger.getGlobal().info("Tuesday");
            case "Wednesday" -> Logger.getGlobal().info("Wednesday");
            case "Thursday" -> Logger.getGlobal().info("Thursday");
            default -> Logger.getGlobal().info("Saturday");
        }
//        Switch statement used to be written like below before JDK 17.

//        switch(today) {
//            case "Saturday","Sunday":
//                Logger.getGlobal().info("It is holiday.");
//                break;
//            case "Monday","Tuesday","Wednesday", "Thursday","Friday":
//                Logger.getGlobal().info("It is working day.");
//                break;
//        }

    }
}
