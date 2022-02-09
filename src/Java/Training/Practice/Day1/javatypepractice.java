package Java.Training.Practice.Day1;

public class javatypepractice {
public static void main (String [] args)  {

    welcome();
    multiply(10, 10);
    multiply(20, 10);
    multiply(20, 20);
    devide(9, 3);
   devide(80, 5);
    devide(18,9);
    }
    public static void welcome() {
        System.out.println("Welcome to our guest");
    }

    public static void multiply(int a, int b) {
    System.out.println(a * b);
    }

    public static void devide(int a, int b) {
        System.out.println(a / b);
    }

}
