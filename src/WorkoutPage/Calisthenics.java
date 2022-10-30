package WorkoutPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calisthenics extends JFrame{
    
    JTable table1, table2, table3;
    JTextArea sess1,sess2,sess3;
    JButton back;
    
    public Calisthenics(JFrame prev){
        setLayout(new GridLayout(2,2));
        back = new JButton("Back");
        String[][] works1 = {{"Exercise", "# Sets", "# Reps"},
                            {"Body Weight Squats", "5 sets", "20 reps"},
                            {"Incline Push Up", "5 sets", "12 reps"},
                            {"Table or Bar Pull Ups", "4 sets", "12 reps"},
                            {"Reverse Hamstring Curls", "3 sets", "10 reps"},
                            {"Dips", "3 sets", "12 reps"},
                            {"Pike Push Up", "3 sets", "12 reps"},
                            {"Side Plank", "3 sets per side", "45 secs"}};
        String[][] works2 = {{"Exercise", "# Sets", "# Reps"},
                            {"Push Up", "5 sets", "10 reps"},
                            {"Table or Bar Chin Ups", "4 sets", "10 reps"},
                            {"Lunges", "3 sets", "20 reps per leg"},
                            {"Pike Push Up", "3 sets", "10 reps"},
                            {"Bulgarian Split Squats", "3 sets", "12 Reps per leg"},
                            {"Calf Raises", "4 sets", "15 reps"},
                            {"Plank", "3 sets", "45 secs"}};
        String[][] works3 = {{"Exercise", "# Sets", "# Reps"},
                            {"Reverse Hyperextension", "5 sets", "10 reps"},
                            {"Decline Push Up", "5 sets", "10 reps"},
                            {"Table or Bar Pull Ups", "5 sets", "10 reps"},
                            {"Hip Thrust", "4 sets", "12 reps"},
                            {"Diamond Push Up", "3 sets", "8-12 reps"},
                            {"Isometric Chin Up", "3 sets", "Until Failure"},
                            {"Dips", "3 sets", "15 reps"},
                            {"Good Mornings", "3 sets", "15 reps"}};
        sess1 = new JTextArea("Day 1");
        sess2 = new JTextArea("Day 2");
        sess3 = new JTextArea("Day 3");
        String[] cols = {"Exercise", "# Sets", "# Reps"};

        table1 = new JTable(works1, cols);
        table2 = new JTable(works2, cols);
        table3 = new JTable(works3, cols);
        
        JScrollPane scroller = new JScrollPane();
        JPanel view = new JPanel();
        view.add(sess1);
        view.add(table1);
        view.add(sess2);
        view.add(table2);
        view.add(sess3);
        view.add(table3);
        
        scroller.setViewportView(view);
        setSize(new Dimension(375,500));
        scroller.setSize(new Dimension(375, 250));
        add(scroller);
        add(back);

        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                prev.setVisible(true);
                setVisible(false);
            }
        });
    }

}
