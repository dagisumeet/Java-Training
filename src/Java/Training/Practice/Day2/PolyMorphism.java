package Java.Training.Practice.Day2;

import javax.naming.PartialResultException;
import java.util.ArrayList;

public class PolyMorphism {
    public static void main(String[] args) {

        add(2, 5);)

        Student student = new Student();
        Teacher teacher = new Teacher();
        Staff staff = new Staff();

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(teacher)
        arrayList.add(student)
        arrayList.add(staff)

    }



        public  static void add(int a, int b) {
            int tem = a + b ;
            System.out.println(tem);
        }

        public  static void add(int a, int b, int c) {
                int tem = a + b + c;
                System.out.println(tem);
        }
        public  static void add(int a, int b, int c, int d) {
            int tem = a + b + c + d;
            System.out.println(tem);
        }

}
