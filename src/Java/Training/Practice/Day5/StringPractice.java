package Java.Training.Practice.Day5;

import javax.swing.*;
import java.util.Locale;
import java.util.logging.Logger;

public class StringPractice {
    public static void main(String[] args) {

        String name = "Sumit Dagi";
        Logger.getGlobal().info(String.valueOf(name.length())); // length method of String practice

        String lowerCaseString = name.toLowerCase();
        Logger.getGlobal().info(lowerCaseString);

        String firstName = name.substring(0,5);
        Logger.getGlobal().info(firstName);

        String lastName = name.substring(6);
        Logger.getGlobal().info(lastName);

        String fullName = firstName+" "+lastName;
        Logger.getGlobal().info(fullName);

        String fulllyName = firstName.concat(" ").concat(lastName);
        Logger.getGlobal().info(fulllyName);

        String time = "AM" + 21 + 9 + 2 ;
        Logger.getGlobal().info(time);

        //join function practice
        String joinExample = String.join("/", "S","L","XL","XXL");
        Logger.getGlobal().info(joinExample);

        //length, isEmply & isBlack function practice
        String s = "   ";
        Logger.getGlobal().info(String.valueOf(s.length()));

        Logger.getGlobal().info(String.valueOf(s.isEmpty()));

        Logger.getGlobal().info(String.valueOf(s.isBlank()));

        //trin method practice

        String trimmedString= s.trim(); // this fuction is practiced when we have to remove unnecessary spaces like in putting email by users.

        Logger.getGlobal().info(String.valueOf(trimmedString.length()));

        Logger.getGlobal().info(String.valueOf(trimmedString.isEmpty()));

        Logger.getGlobal().info(String.valueOf(trimmedString.isBlank()));











    }
}




