package Java.Training.Practice.Day13;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {2,1,9,5,3};

//        Arrays.sort(numbers);
        Arrays.sort(numbers,0,5);
        /*this method will use the same Array and making any changes will chage in the original
        date store too. to avoid this, we can use following method */
        Arrays.sort(Arrays.copyOf(numbers,numbers.length));


        for(int num : numbers){
            System.out.println(num+" ");
        }
        //In multiple sorting. It sorts as per alphabetical order.
        String[] employees = new String[3];

        employees[0] = "Sumit Dagi";
        employees[1]  = "Gopal Dahal";
        employees[2]   ="Santosh Kafle";

        Arrays.sort(employees);

        for(String emp:employees){
            System.out.println(emp);
        }

    }
}
