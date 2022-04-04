package Java.Training.Practice.Day28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,7,9,10);
        Stream<Integer> numberStream =numbers.stream(); // converting the abover list to stream becaseu to use stream function we need to convert all kind of list to stream.
    // If we have to create the new stream we can do as follows.

        Stream<Integer> newNumberStream = Stream.of(1,2,3,5,8,7,9,10);
        List<Double> cubicNewNumber = newNumberStream
                //below functions are the intermediate operatiosn of stream.
                .map(x -> x * x * x)
                .map(x -> Math.sqrt(x))
                .sorted()
                // Below .collect is terminal operations
                .collect(Collectors.toList()); // it converts the streams to list.
        System.out.println(cubicNewNumber);

        Stream<Integer> NumberStream2 = Stream.of(2,3,5,6,8,10);
        List<Integer> cubicNewNumber1 = NumberStream2
                .sorted()
                .filter(x -> x %2 == 0) // sorting just even number
                .collect(Collectors.toList()); // it converts the streams to list.
        System.out.println(cubicNewNumber1);

        //FlatMap- I can merge 3 of the list in one single list.
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<List<Integer>> listOfNumbers = Arrays.asList(list1, list2, list3);
        List<Integer> listOfAllIntegers = listOfNumbers.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(listOfNumbers); // in put all thosee three list in one single list.

//  Distict: this will distinct the duplicate contain but it require equal method to be implemented.

        List<String> countries = Arrays.asList("India", "Australia",
                "SriLanka","Russia", "Australia","SriLanka","India");
        List<String> distinctCountries = countries.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctCountries);
    }








}
