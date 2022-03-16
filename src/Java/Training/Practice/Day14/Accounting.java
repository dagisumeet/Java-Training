package Java.Training.Practice.Day14;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Accounting{
    public static void main(String[] args) {

        Manager boss = new Manager("Sumit", 38, LocalDate.now(), 5000, 1000);

        Employee employee1 = new Employee("Rabi", 35, LocalDate.now(), 3000);

//        System.out.println(boss.getSalary());
//        System.out.println(employee1.getSalary());

        //Compiletime polymorphism.
        Accounting accounting = new Accounting();
        accounting.add(3,5);
        accounting.add(6, 9,22);

        //Runtime polymorphism.
        Employee boss2 = new Manager("Himal", 25,LocalDate.now(),6500, 500);
        ((Manager)boss2).getBonus(); //this is called typecasting. It has been done to access the getBonus which we had lost because of polymorphism.
        Logger.getGlobal().info(String.valueOf(boss2.getSalary()));

    }

    public void add(int a, int b){};
    public void add(int a, int b, int c){};
}
