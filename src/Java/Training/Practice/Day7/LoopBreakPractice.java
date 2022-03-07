package Java.Training.Practice.Day7;

import java.util.logging.Logger;

public class LoopBreakPractice {
    public static void main(String[] args) {
        int years =88;
        int payment = 15000;
        int goal = 1000000;
        int balance = 100000;
        double interestRate= 7.50;

// Didn't workout.
        while ( years <=100){
            balance +=  payment;
            double interest = balance*interestRate/100;
            balance+=interest;
            if (balance >= goal) break;
            years ++;

            Logger.getGlobal().info(String.valueOf(balance));

        }

    }
}
