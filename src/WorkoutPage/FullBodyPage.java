package WorkoutPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class FullBodyPage extends JFrame{
    
    JTable table1, table2, table3;
    JTextArea sess1,sess2,sess3;
    JButton back;
    
    public FullBodyPage(JFrame prev){
        setLayout(new GridLayout(2,2));
        back = new JButton("Back");
        String[][] works1 = {{"Squats", "5 sets", "5 reps"},
                            {"Dumbbell Bench Press", "4 sets", "8 reps"},
                            {"Bent Over Row", "4 sets", "6 reps"},
                            {"Romanian Deadlift", "3 sets", "8 reps"},
                            {"Dips", "2 sets", "Until Failure"},
                            {"Lateral Raise", "2 sets", "15 reps"},
                            {"Face Pull", "2 sets", "15 reps"}};
        String[][] works2 = {{"Bench Press", "5 sets", "5 reps"},
                            {"Pull Ups", "4 sets", "6 reps"},
                            {"Leg Press", "3 sets", "8 reps"},
                            {"Seated Dumbbell Shoulder Press", "3 sets", "10 reps"},
                            {"Walking Lunges", "1 set", "75 steps per leg"},
                            {"Leg Extension", "2 sets", "15 reps"},
                            {"Leg Curl", "2 sets", "15 reps"},
                            {"Calf Raises", "2 sets", "15 reps"}};
        String[][] works3 = {{"Deadlift", "5 sets", "5 reps"},
                            {"Military Press", "4 sets", "6 reps"},
                            {"Seated Row", "3 sets", "8 reps"},
                            {"Hip Thrust", "3 sets", "8 reps"},
                            {"Skull Crusher", "3 sets", "10 reps"},
                            {"Hammer Curl", "3 sets", "10 reps"},
                            {"Tricep Extension", "2 sets", "15 reps"},
                            {"Preacher Curl", "2 sets", "15 reps"}};
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
        setSize(new Dimension(600,450));
        scroller.setSize(new Dimension(600, 225));
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
