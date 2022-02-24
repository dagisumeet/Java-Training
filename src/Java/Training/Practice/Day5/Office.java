package Java.Training.Practice.Day5;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Office {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sumit", "2500", LocalDate.now());

        Employee employee2 = new Employee("Amit", "3000", LocalDate.now());
        employee2.setAge(30);

        Logger.getGlobal().info(employee1.getName());
        Logger.getGlobal().info(employee2.getName());

    }
}