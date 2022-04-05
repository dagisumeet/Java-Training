package Java.Training.Practice.Day29;

public class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName());
    }
}
