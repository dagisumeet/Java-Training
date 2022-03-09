package Java.Training.Practice.Day12;

import java.util.Arrays;

public class ArrayCopyPractice {
    public static void main(String[] args) {

        String[] employees = new String[5];

        employees[2] = "Sumit Dagi";
        System.out.println("*********Before Printing*************");
              for(String employee:employees) {
                System.out.println(employee);
        }

//              String[] employeeCopy = employees;
              /* if we copy this way and make changes, the original date will also
        be changed to avoid such risk we can  use following class/function*/
            String[] employeeCopy = Arrays.copyOf(employees,employees.length);

        employeeCopy[3]= "Rabi Limbu";
        System.out.println("*********After Printing*************");
        for(String employee:employees) {
            System.out.println(employee);
        }



    }

}
