package Java.Training.Practice.Day17;

import java.util.Objects;

public class Employee {

    private String name = ""; // required
    private float salary; // required
    private String phoneNumber = ""; // required
    private String liscenceNumber = ""; // optional
    private String genger = "male"; // Male, Female, Others // required
    public static int employeeCount = 0;

//    public Employee() {
//        Logger.getGlobal().info("Default Constructor Called");
//        this.name = "";
//        this.salary = 0;
//        this.phoneNumber = "";
//        this.liscenceNumber = "";
//    }

    public Employee(String name, float salary, String phoneNumber, String  gender){
        this.name = Objects.requireNonNullElse(name, "");
        this.salary = salary;
        this.phoneNumber = Objects.requireNonNullElse(phoneNumber, "");
        this.genger = Objects.requireNonNullElseGet(gender, () -> genger);
//        Logger.getGlobal().info("First Parameterized Constructor");
    }

////    public Employee(String name, float salary, String phoneNumber, String  gender, String liscenceNumber){
//        this(name, salary, phoneNumber, gender);
//        this.liscenceNumber = liscenceNumber;
////        Logger.getGlobal().info("Second Parameterized Constructor");
//    }

    public Employee() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLiscenceNumber() {
        return liscenceNumber;
    }

    public void setLiscenceNumber(String liscenceNumber) {
        this.liscenceNumber = liscenceNumber;
    }

    public String  getGender() {
        return genger;
    }

    public void setGender(String gender) {
        this.genger = gender;
    }

    // this
    public void addBonus(float bonus){
        this.salary = this.salary + bonus;
    }

    public static void increaseEmployeeCount(){
        employeeCount = employeeCount + 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", liscenceNumber='" + liscenceNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
