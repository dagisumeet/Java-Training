package Java.Training.Practice.Day19;


public class Employee19 implements Comparable<Employee19>{

    private String name = ""; // required
    private float salary; // required
    private String phoneNumber = ""; // required
    private String licenseNumber = ""; // optional
    private int age;


    public Employee19(String name, float salary, String phoneNumber, String licenseNumber) {
        this.name = name;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.age = age;

            }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee19{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Employee19 o) {
//        return Float.compare(this.salary, o.salary);
        return Float.compare(o.salary, this.salary); // Writing this will print the salary value in descending order.
    }
}