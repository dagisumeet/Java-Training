package Java.Training.Practice.Day19;

import java.util.Arrays;

public class InterfacePractice {

    public static void main(String[] args) {

        Employee19[] employees = new Employee19[3];

        employees[0] = new Employee19("ABC", 2000, "9851181533", "123654");
        employees[1] = new Employee19("ABC", 1500, "9851115633", "123654");
        employees[2] = new Employee19("ABC", 1200, "98511451233", "123654");


        Arrays.sort(employees);


        for (Employee19 emp : employees) {
            System.out.println(emp);
        }

    }





}
