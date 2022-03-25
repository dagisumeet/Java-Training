package Java.Training.Practice.Day20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.time.Instant;

public class TimerTest {
    public static void main(String[] args) {

        ActionListener actionListener = new TimerListener();

//        Timer timer = new Timer(1000,actionListener); //Timer. swing select
//        timer.start();

        Timer timer = new Timer(1000, e -> {
            System.out.println("Action performed getting called"
                    + Instant.ofEpochMilli(e.getWhen())); // This code is give the time details.
            Toolkit.getDefaultToolkit().beep(); // This method is for beep sound.
        });

          timer.start();

            JOptionPane.showMessageDialog(null, "Quit Program"); // this is to show the dialog to stop printing time/whatever.
            System.exit(0);

    }
}
