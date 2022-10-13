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

        log = new JButton("test");
        plan = new JButton("tet2");

        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridx = 0;
        con.gridy = 0;
        frame.add(log, con);
        con.gridx = 1;
        con.gridy = 0;
        frame.add(plan, con);
        frame.setSize(300,300);
        frame.setPreferredSize(frame.getSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new WorkoutPage();
    }
}
