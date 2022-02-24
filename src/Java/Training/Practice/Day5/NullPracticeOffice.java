package Java.Training.Practice.Day5;

import java.time.LocalDate;
import java.util.logging.Logger;

public class NullPracticeOffice {

    public static void main(String[] args) {

        NullPracticeEmployee employee1 = new NullPracticeEmployee(null, "2500", null);

        NullPracticeEmployee employee2 = new NullPracticeEmployee("Amit", "3000", LocalDate.now());
        employee2.setAge(30);

        Logger.getGlobal().info(employee1.getName());
       // Logger.getGlobal().info(employee2.getName());

    }
}
