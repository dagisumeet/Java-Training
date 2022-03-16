package Java.Training.Practice.Day15;

public class Teacher extends Person{

    private String subject;


    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void printDescription() {
        System.out.println("Teacher description");
    }
}

