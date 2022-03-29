package Java.Training.Practice.Day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorPractice {

    public static void main(String[] args) {
        Collection<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");
        stringArrayList.add("d");
        stringArrayList.add("e");

        Iterator<String > iterator = stringArrayList.iterator();

//        while (iterator.hasNext()) {
//            String item = iterator.next();
//
//            System.out.println(item);
//        }


        for (String item : stringArrayList) {
            System.out.println(item);

        }


        boolean contains= stringArrayList.contains("e");
        System.out.println(contains);

//        String s = iterator.next();
//        String s1 = iterator.next();
//        String s2 = iterator.next();
//        String s3 = iterator.next();
//        String s4 = iterator.next();
//        String s5 = iterator.next();


//        System.out.println(s5);

        Collection<Student> studentArrayList = new ArrayList<>();

        studentArrayList.add(new Student("Sumit", 52));
        studentArrayList.add(new Student("Gopal", 32));
        studentArrayList.add(new Student("Hari", 11));
        studentArrayList.add(new Student("Shyam", 12));

        for(Student details : studentArrayList) {
            System.out.println(details);
        }
        boolean sContains= stringArrayList.contains(new Student("Gopal", 32));
        System.out.println(sContains);









    }
}
