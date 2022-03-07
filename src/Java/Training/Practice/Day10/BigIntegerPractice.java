package Java.Training.Practice.Day10;

import java.math.BigInteger;
import java.util.logging.Logger;

public class BigIntegerPractice {
    public static void main(String[] args) {

        long anyNumber = 1921053241;

        anyNumber = anyNumber +1;

        BigInteger anyLargenumber = new BigInteger("151651230215613216515");
//        BigInteger addedLargeNumber = anyLargenumber.add(BigInteger.ONE);


//        BigInteger subtractedLargeNumber = anyLargenumber.subtract(BigInteger.ONE);

        BigInteger multifliedLargeNumber = anyLargenumber.multiply(BigInteger.ONE);
        Logger.getGlobal().info(String.valueOf(multifliedLargeNumber));



    }
}
