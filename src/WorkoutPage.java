import javax.swing.*;
import java.awt.*;

public class WorkoutPage {
    JFrame frame;
    JButton settings, back, log, plan, workout;
    JTextArea text1, text2, text3;
    public WorkoutPage(){
        frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();

        log = new JButton("History");
        plan = new JButton("Plans");
        workout = new JButton("Log Workout");
        settings = new JButton("Settings");
        back = new JButton("Back");
        /*TODO: add action listeners for plans, log, and workout
        *   make the pages for those buttons
        *
        */
        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridx = 0;
        con.gridy = 0;
        frame.add(back, con);
        con.gridx = 1;
        con.gridy = 0;
        frame.add(settings, con);
        con.gridx = 0;
        con.gridy = 1;
        frame.add(workout, con);
        con.gridx = 1;
        con.gridy = 1;
        frame.add(plan, con);
        con.gridx = 0;
        con.gridy = 0;
        frame.add(back, con);
        con.gridx = 0;
        con.gridy = 2;
        frame.add(log, con);
        frame.setSize(300,300);
        frame.setPreferredSize(frame.getSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new WorkoutPage();
    }
}
