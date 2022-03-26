package Java.Training.Practice.Day22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age.");
        try {
        int age = scanner.nextInt();
        if(age <18) {
            throw new AgeRestrictionException("You are Under Age.");
        }

        }catch (InputMismatchException e) {
            e.printStackTrace();
        }catch(AgeRestrictionException e) {
//            e.printStackTrace();

        }
        finally {
            scanner.close();
        }
    }
}
