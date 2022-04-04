package Java.Training.Practice.Day27;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {

    public static void main(String[] args) {

        PriorityQueue<String > queue = new PriorityQueue<>();

        queue.add("Sumit");
        queue.add("Hari");
        queue.add("Gopal");
        queue.add("Bishnu");

//        System.out.println("Head" +queue.element()); //It is sorting alphabetical order and picking the topmost.
        System.out.println(("Head: " + queue.peek()));

        System.out.println("Iterating the queue elements:");

//        Iterator<String > itr = queue.iterator(); // It is not prefered to use Iterator method in case of PriorityQueue coz it may not give you the right order.
        //        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }


        queue.remove(); //this remove the item from list, it removes the element of top as it is queue.
        queue.poll();



        System.out.println(queue);


        }

    }




