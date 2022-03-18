package Java.Training.Practice.Day16;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Employee>employees= new ArrayList<>(100); //If we mention the size of items, it will create that many number of item in same memory list but we can create more that that number of itmems. But in that case it will take new memory space.

        Employee[] employees1 = new Employee[20]; // This is the syntax of regular array. But, arraylist is way better in terms of usages.


        employees.add(new Employee("sumit", 25000, "9842133614", "Male"));
        employees.add(new Employee("sumit", 25000, "9842133614", "Male"));
        employees.add(new Employee("sumit", 25000, "9842133614", "Male"));


        System.out.println(employees);

        System.out.println("####################### After Removal ##############################");

        System.out.println(employees.remove(1)); // .remove will remove the data located in a particular index. We hvae to mentioin which index data we want to remove.




    }

}
