package Java.Training.Practice.Day15;

public class SchoolManagementApp {
    public static void main(String[] args) {
//        Person person = new Person("Sumit", 38); // it cannot be implemented because it is restricted by key word Abstract in class Person.
//        person.printDescription();

        Student student = new Student("Sumit", 35, 1);
        Student student1 = new Student("Hari", 38,1);
//        System.out.println(student.toString());
//        System.out.println(student1.toString());

//        System.out.println(student == student1);

        System.out.println(student.equals(student1));


//        student.printDescription();
//
//        Staff staff = new Staff("Sumit", 38);///        staff.printDescription();
//
//        Teacher teacher = new Teacher("Sumit", 38);
//        teacher.printDescription();
//
    }


}
