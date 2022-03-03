package Java.Training.Practice.Day8;

import java.util.Scanner;
import java.util.logging.Logger;

public class StudentMarksPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name:  ");
        String name = in.nextLine();
        System.out.println("Enter your Math's marks:  ");
        float math = in.nextFloat();
        System.out.println("Enter your Science's marks:  ");
        float science = in.nextFloat();
        System.out.println("Enter your Computer's marks:  ");
        float computer = in.nextFloat();
        System.out.println("Enter your Social's marks:  ");
        float social = in.nextFloat();

        float percentage = ((math + science + computer+social)/400*100);
        System.out.println(name+ " 's total percentage obtained is " + percentage +" %"+".");

        Logger.getGlobal().info(String.valueOf("Name=" + name));
        Logger.getGlobal().info(String.valueOf("Math's marks=" + math));
        Logger.getGlobal().info(String.valueOf("Science marks=" + science));
        Logger.getGlobal().info(String.valueOf("Computer marks=" + computer));
        Logger.getGlobal().info(String.valueOf("Social marks=" + social));
        Logger.getGlobal().info(String.valueOf("Percentage =" + percentage));









    }
}
