package Java.Training.Practice.Day29;

public class Bank {
    public static void main(String[] args) {
        Runnable runner = () -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());

        };
//        Runner runner = new Runner();

        Thread thread1 = new Thread(runner);
        thread1.setName("Thread 1");
        thread1.start();
//        thread1.stop(); // it stops treading but it is deprecated, there are some other method to execute it.
        thread1.interrupt(); // we need to use this instead of .stop method. it may work or not.
        Thread thread2 = new Thread(runner);
        thread2.setName("Thread 2");
        thread2.start();

        Thread thread3 = new Thread(runner);
        thread3.setName("Thread 3");
        thread3.start();

        Thread thread4 = new Thread(runner);
        thread4.setName("Thread 4");
        thread4.start();
    }


}
