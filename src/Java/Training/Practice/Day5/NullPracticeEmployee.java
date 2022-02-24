package Java.Training.Practice.Day5;

import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Logger;

public class NullPracticeEmployee {

    public boolean getAge;
    private String name; //requried
    private String salary; //requried
    private LocalDate joiningDate; //requried
    private int age;


        public NullPracticeEmployee(String name, String  salary, LocalDate joiningDate){
        Logger.getGlobal().info(name);
        Logger.getGlobal().info(String.valueOf(salary));
        Logger.getGlobal().info(String.valueOf(joiningDate));

        this.name= Objects.requireNonNullElse(name, "unknown");
        this.salary = salary;
        this.joiningDate = Objects.requireNonNullElse(joiningDate, LocalDate.now());;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;


    }
}
