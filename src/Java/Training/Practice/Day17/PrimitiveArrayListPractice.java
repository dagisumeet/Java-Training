package Java.Training.Practice.Day17;

import java.util.ArrayList;

public class PrimitiveArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>(); //This is how we have to prepare the Arraylist of primitive dattype. We have to use first letter Uppercase in terms of all.

        ints.add(3);
        ints.add(1);
        ints.add(8);
        ints.add(7);
        ints.add(6);
        ints.add(5);

        Integer integer=ints.get(2);// Here we get the data of index number 2 i.e. 8
        System.out.println(integer);

    }
}
