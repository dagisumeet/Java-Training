package Java.Training.Practice.Day26;

import java.util.Objects;

public class Student {
    private String name;
    private int rollnumber;

    public Student(String name, int rollnumber) {
        this.name = name;
        this.rollnumber = rollnumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnumber=" + rollnumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollnumber == student.rollnumber && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollnumber);
    }
}
