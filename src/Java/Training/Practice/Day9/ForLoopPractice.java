package Java.Training.Practice.Day9;

import java.util.logging.Logger;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i=1; i<=10; i++){
            Logger.getGlobal().info(String.valueOf(i));
        }
    }
}
