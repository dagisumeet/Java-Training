package Java.Training.Practice.Day8;

import java.util.logging.Logger;

public class IfPractice2 {
    public static void main(String[] args) {
//        int yourSale = 400;
//        int target = 500;
//
//        if (yourSale >= target) {
//            Logger.getGlobal().info("You have won $50 bonus.");
//        }
//        else if (yourSale == target) {
//            Logger.getGlobal().info("You have won $10 bonus.");
//        }
//        else  {
//            Logger.getGlobal().info("You have won no bonus.");
//        }

        int yourSale = 1450;
        int target = 500;

        if (yourSale >= 3*target) {
            Logger.getGlobal().info("You have won $50 bonus.");
        }
        else if (yourSale >= 2*target) {
            Logger.getGlobal().info("You have won $30 bonus.");
        }
        else if (yourSale >= target) {
            Logger.getGlobal().info("You have won $20 bonus.");
        }
        else  {
            Logger.getGlobal().info("You have won no bonus.");
        }


//        int yourSale = 900;
//        int target = 1000;
//        String performance;
//        int bonus;
//
//        if (yourSale >= 3*target) {
//            performance = "Excellent";
//            bonus = 500;
//        }
//        else if (yourSale >= 2*target) {
//            performance = "Fine";
//            bonus = 300;
//        }
//        else if (yourSale >= target) {
//            performance = "Good";
//            bonus = 100;
//        }
//        else  {
//            Logger.getGlobal().info("Work harder next month.");
//        }
    }
}
