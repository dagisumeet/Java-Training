package Java.Training.Practice.Day17;

import java.util.ArrayList;

public class More2ArrayPractice {
    public static void main(String[] args) {


        ArrayList<Employee>employees= new ArrayList<>();

        Employee employee1 = new Employee("Hari", 250, "984233614", "Female");
        Employee employee2 = new Employee("Sumit", 100, "984233614", "Female");
        Employee employee3 = new Employee("Himal", 250, "984233614", "Female");

       employees.add(employee1);
       employees.add(employee2);
       employees.add(employee3);


        System.out.println("################ Before Removal #################");
        System.out.println(employees);


        System.out.println("################ After Removal #################");
//        employees.remove(1);
//        employees.remove(new Employee("Sumit", 250, "984233614", "Female"));

        employees.remove(new Employee("Sumit",100, "984233614", "Female"));
        // in case of the class created by us, it won't remove the index value or content by itself because it is a different object and there is not automated override method.
        // in this case we need to create override of equal method and hash code, then only we can remove it.

        System.out.println(employees);


    }
}
