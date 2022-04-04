package Java.Training.Practice.Day26;

import java.util.*;

public class LinkListPractice {
    public static void main(String[] args) {

    Collection<Student> linkedList = new TreeSet<>();

        linkedList.add(new Student("Sumit", 52));
        linkedList.add(new Student("Gopal", 32));
        linkedList.add(new Student("Hari", 11));
        linkedList.add(new Student("Shyam", 12));
        linkedList.add(new Student("Shyam", 12));

        System.out.println(linkedList.toString());

//        linkedList.remove(new Student("Hari", 11));


//        System.out.println(linkedList.size());

//
//            boolean sContains= linkedList.contains(new Student("Gopal", 32));
//        System.out.println(sContains);
//
//        for(Student details : linkedList) {
//        System.out.println(details);

//        }

    }
}
