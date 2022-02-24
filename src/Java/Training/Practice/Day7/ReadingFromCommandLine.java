package Java.Training.Practice.Day7;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class ReadingFromCommandLine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please inter your name: ");
        String name = in.nextLine();

        System.out.println("Please inter your age: ");

        int age = in.nextInt();

        System.out.println(name + "'s age is " + age);

    }
}
