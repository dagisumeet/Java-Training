package Java.Training.Practice.Day22;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerPractice {
    private static final Logger myLogger = Logger.getLogger(LoggerPractice.class.getSimpleName());

    public static void main(String[] args) {

       myLogger.setLevel(Level.WARNING);

        myLogger.severe("This is my severe level log. ");
        myLogger.warning("This is my warning level log. ");
        myLogger.info("This is my info info log. ");
        myLogger.config("This is my config level log. ");
        myLogger.fine("This is my fine level log. ");
        myLogger.finer("This is my finer level log. ");
        myLogger.finest("This is my finest level log. ");





    }
}
