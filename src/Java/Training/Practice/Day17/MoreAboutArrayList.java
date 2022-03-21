package Java.Training.Practice.Day17;

import java.awt.*;
import java.util.ArrayList;

public class MoreAboutArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(9);
        integerArrayList.add(7);

        //  Removal of Data by index name
//        System.out.println("################ Before Removal #################");
//        System.out.println(integerArrayList);
//
//
//        System.out.println("################ After Removal #################");
//        integerArrayList.remove(2);
//        System.out.println(integerArrayList);

        //  Removal of Data by index value
        System.out.println("################ Before Removal #################");
        System.out.println(integerArrayList);


        System.out.println("################ After Removal #################");
        integerArrayList.remove(3);
        System.out.println(integerArrayList);




    }
}
