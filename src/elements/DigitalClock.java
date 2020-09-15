package elements;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.awt.Font.BOLD;

public class DigitalClock implements Runnable {

    private Thread thread = null;
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    private String timeString = "";

    private JLabel timeLabel = null;

    public DigitalClock() {
        timeLabel = new JLabel(timeString);
        timeLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Calendar calendar = Calendar.getInstance();
                hours = calendar.get(Calendar.HOUR_OF_DAY);
                minutes = calendar.get(Calendar.MINUTE);
                seconds = calendar.get(Calendar.SECOND);

                // 0-12 -> hh 0-24 -> HH
                SimpleDateFormat fDateFormat = new SimpleDateFormat("HH:mm:ss");
                Date date = calendar.getTime();
                timeString = fDateFormat.format(date);

                timeLabel.setText(timeString);

                Thread.sleep(1000);
            }
        } catch (Exception e) {

        }
    }

    public JLabel getTimeLabel() {
        return timeLabel;
    }

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

}
