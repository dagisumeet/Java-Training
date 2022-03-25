package Java.Training.Practice.Day20;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimerListener implements ActionListener {  //whenever we create the interfae ActionListener it asks to create the method override of actionPerformed. It is done automatically.
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed getting called"
                + Instant.ofEpochMilli(e.getWhen() )); // This code is give the time details.
        Toolkit.getDefaultToolkit().beep(); // This method is for beep sound.
    }
}
