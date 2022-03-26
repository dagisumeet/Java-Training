package Java.Training.Practice.Day22;

import java.util.logging.Logger;

public class AssertionPractice {
    public static void main(String[] args) {
        int x = -2;

//        if (x < 0) throw new IllegalArgumentException("x < 0");
        assert  x >= 0: "The value of x should be greater than 0.";
        double y = Math.sqrt(x);

        System.out.println(y);
    }
}