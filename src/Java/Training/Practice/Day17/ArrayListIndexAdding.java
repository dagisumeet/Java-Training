package Java.Training.Practice.Day17;

import java.util.ArrayList;

public class ArrayListIndexAdding {
    public static void main(String[] args) {


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(9);
        integerArrayList.add(7);


        System.out.println("################ Regular ArrayLIst #################");
        System.out.println(integerArrayList);

        // Adding a new index in between the list with the help of .add method.
//        System.out.println("################ After Adding #################");
//        integerArrayList.add(2,8);
//        System.out.println(integerArrayList);

        // Updating/Replacing the index value/element by . set method.
//
//        System.out.println("################ After Updating #################");
//        integerArrayList.set(3, 10);
//        System.out.println(integerArrayList);

        // To check if a particular value is contained in the list or not we use .contain method.

        System.out.println("################ Checking contain or not #################");
//       boolean isPresent= integerArrayList.contains(10); // This value will come false and
        boolean isPresent= integerArrayList.contains(7); // this value will come true.
        System.out.println(isPresent);

        //Let's see in terms of Employee.

        ArrayList<Java.Training.Practice.Day17.Employee>employees= new ArrayList<>();

        Employee employee1 = new Employee("Hari", 250, "984233614", "Female");
        Employee employee2 = new Employee("Sumit", 100, "984233614", "Female");
        Employee employee3 = new Employee("Himal", 250, "984233614", "Female");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        // Below method checks if this particular value is contained in the array list or not. But, we have to make sure that we have to create override of equal method and hashcode method for result to come correct.
        boolean isPresentEmployee = employees.contains( new Employee("Hari", 250, "984233614", "Female"));

        System.out.println(isPresentEmployee);





    }
}
