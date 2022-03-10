package Java.Training.Practice.Inheritance;

import java.time.LocalDate;

public class Accounting{
    public static void main(String[] args) {

        Manager boss = new Manager("Sumit", 38, LocalDate.now(), 5000, 1000);

        Employee employee1 = new Employee("Rabi", 35, LocalDate.now(), 3000);

        System.out.println(boss.getSalary());
        System.out.println(employee1.getSalary());


    }
}
