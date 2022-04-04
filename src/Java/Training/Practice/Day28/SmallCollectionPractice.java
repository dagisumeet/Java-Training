package Java.Training.Practice.Day28;

import java.util.*;
import java.util.logging.Logger;

public class SmallCollectionPractice {
    public static void main(String[] args) {

        final List<String> names = new ArrayList<>();

        names.add("Sumt");
        names.add("Hari");
        names.add("Himal");

        System.out.println(names);
        Collections.unmodifiableCollection(names); //This will convert regualr array list to unmobifiable list.
       Collection<String> synchronizedNames =  Collections.synchronizedCollection(names); // This synchronized function will sync the work done in the list my multiple functions.
        Collections.sort(names); // here we can sort in order ( like tree ) and can put duplicate elements too. I hacks the limitations of Treeset function.
        List <String> immutableNames = List.of("Sumit", "Hari","Himal", "Gopal", "Madan");

//        immutableNames.remove("Sumit");


        System.out.println(immutableNames);


        Set<Integer> numbers = Set.of(11,14,15);

//        numbers.add(16);

        System.out.println(numbers);


        ArrayList<String > mutableNames = new ArrayList<>(immutableNames); // changing immmutable to mutable.

        mutableNames.add("Rabi");

        System.out.println(mutableNames.toString());

        List<String> multipleCopies = Collections.nCopies(100, "Choyang");

//        System.out.println(multipleCopies);


    }


}
