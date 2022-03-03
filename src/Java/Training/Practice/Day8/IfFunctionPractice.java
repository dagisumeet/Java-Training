package Java.Training.Practice.Day8;

import java.util.logging.Logger;

public class IfFunctionPractice {
    public static void main(String[] args) {
        float percentage = 38;

        if(percentage >= 80)
        {
            Logger.getGlobal().info("Congratulations you have passed with distinction.");
        }
        else if (percentage > 60)
        {Logger.getGlobal().info("Congratulations you have passed with first division.");}
        else if (percentage >= 40)
        {Logger.getGlobal().info("Congratulations you have passed second division.");}
        else
        {Logger.getGlobal().info("You have failed.");}
    }
}
