package Java.Training.Practice.Day22;

import java.io.IOException;
import java.util.logging.Logger;

public class ExceptionPractice {

    public static void main(String[] args) {

        MyImage myImage = new MyImage();

//        try {
//
//        }catch (IOException e) {
////            e.printStackTrace();
//            Logger.getGlobal().info(e.getMessage());
//        }

        try {
            myImage.getImageURL();
            myImage.downloadImage("http://facebook.com/12564.png");

        }catch (IndexOutOfBoundsException | IOException e) {
            e.printStackTrace();
            Logger.getGlobal().info(e.getMessage());

        }


    }
}
