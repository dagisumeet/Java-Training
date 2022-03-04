package Java.Training.Practice.Day9;

import java.util.logging.Logger;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int i =1;

        while (i<=20) {
            Logger.getGlobal().info(String.valueOf(i));
           i++;
        }
    }
}
