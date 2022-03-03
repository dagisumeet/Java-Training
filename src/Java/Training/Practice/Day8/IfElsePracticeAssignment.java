package Java.Training.Practice.Day8;

import java.util.Scanner;
import java.util.logging.Logger;

public class IfElsePracticeAssignment {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Logger.getGlobal().info("Value of i: ");
        int i = in.nextInt();
        Logger.getGlobal().info("Value of j: ");
        int j = in.nextInt();
        Logger.getGlobal().info("Value of k:  ");
        int k = in.nextInt();

        if (i>j && i>k)
        {Logger.getGlobal().info("i is greater.");}
        else if (j>i && j>k)
        {Logger.getGlobal().info("j is greater.");}
        if (k>i && k>j)
        {Logger.getGlobal().info("k is greater.");}

        String greatestValue= String.format("Greatest value is %d",i,j,k);
        Logger.getGlobal().info(String.valueOf(greatestValue));


    }
}