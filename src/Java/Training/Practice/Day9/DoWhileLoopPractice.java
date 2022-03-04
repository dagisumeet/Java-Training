package Java.Training.Practice.Day9;

import java.util.logging.Logger;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        int i = 1;

        do {
            Logger.getGlobal().info(String.valueOf(i));
            i++;
        }while (i<=15);
    }
}
