package WorkoutPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class UpperLower extends JFrame{
    JTable table1, table2, table3, table4;
    JTextArea sess1,sess2,sess3,sess4;
    JButton back;
    
    public UpperLower(JFrame prev){
        setLayout(new GridLayout(2,2));
        back = new JButton("Back");
        String[][] works1 = {{"Back Squat", "5 sets", "5 reps"},
                            {"Romanian Deadlift", "4 sets", "8 reps"},
                            {"Calf Raise", "3 sets", "8 reps"},
                            {"Leg Extension", "3 sets", "10 reps"},
                            {"Leg Curl", "3 sets", "10 reps"}};
        String[][] works2 = {{"Barbell Bench Press", "5 sets", "5 reps"},
                            {"Pull Ups", "4 sets", "8 reps"},
                            {"Dips", "3 sets", "10 reps"},
                            {"Skull Crusher", "3 sets", "12 reps"},
                            {"Hammer Curl", "3 sets", "12 reps"}};
        String[][] works3 = {{"Deadlift", "5 sets", "5 reps"},
                            {"Hack Squat", "4 sets", "8 reps"},
                            {"Hip Thrust", "4 sets", "8 reps"},
                            {"Calf Raise", "3 sets", "12 reps"}};
        String[][] works4 = {{"Barbell Row", "4 sets", "6 reps"},
                            {"Incline Bench Press", "4 sets", "6 reps"},
                            {"Seated Row", "4 sets", "10 reps"},
                            {"Preacher Curl", "3 sets", "12 reps"},
                            {"Tricep Extension", "3 sets", "12 reps"}};
        sess1 = new JTextArea("Upper A");
        sess2 = new JTextArea("Lower A");
        sess3 = new JTextArea("Upper B");
        sess4 = new JTextArea("Lower B");
        String[] cols = {"Exercise", "# Sets", "# Reps"};

        table1 = new JTable(works2, cols);
        table2 = new JTable(works1, cols);
        table3 = new JTable(works4, cols);
        table4 = new JTable(works3, cols);
        
        JScrollPane scroller = new JScrollPane();
        JPanel view = new JPanel();
        view.add(sess1);
        view.add(table1);
        view.add(sess2);
        view.add(table2);
        view.add(sess3);
        view.add(table3);
        view.add(sess4);
        view.add(table4);

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
