package WorkoutPage;
import javax.swing.*;
import javax.swing.table.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class Cardio extends JFrame{
    
    JTextArea sess;
    JButton back;
    JTable table;
    
    public Cardio(JFrame prev){
        setLayout(new GridLayout(2,2));
        back = new JButton("Back");
        String[][] work = {{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"},
                            {"5' Walk + 10x 30s Run + 1' Walk", "20' Biking", "Rest Day", "5' Walk + 10x 1' Run + 1' Walk", "20' Swiming", "5' Walk + 10x 1' Run + 1' Walk", "Rest Day"},
                            {"5' Walk + 10x 90s Run + 1' Walk", "25' Biking", "Rest Day", "5' Walk + 10x 2' Run + 1' Walk", "30' Rowing", "5' Walk + 10x 90s Run + 30s Walk", "Rest Day"},
                            {"5' Walk + 8x 2.5' Run + 1' Walk", "30' Swimming", "Rest Day", "5' Walk + 8x 3' Run + 1' Walk", "30' Biking", "5' Walk + 6x 4' Run + 1' Walk", "Rest Day"},
                            {"5' Walk + 5x 5' Run + 1' Walk", "30' Rowing", "Rest Day", "5' Walk + 2x 10' Run + 2' Walk", "30' Biking", "5' Walk + 2x 10' Run + 30s Walk", "20' Rowing"},
                            {"Rest Day", "5' Walk + 25' Run!", "", "Make sure you use the 5 minute walk", "as warmups to your runs!", "", ""}};
        
        String[] cols = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        table = new JTable(work, cols);
        table.setRowHeight(40);
        TableColumnModel model = table.getColumnModel();
        for(int i = 0; i < work[0].length; i++){
            model.getColumn(i).setPreferredWidth(188);
        }
        
        JScrollPane scroller = new JScrollPane();
        JPanel view = new JPanel();
        view.add(table);
        view.setBackground(new Color(255, (int) (105*1.5), (int) (97*1.5)));
        
        scroller.setViewportView(view);
        setSize(prev.getSize());
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
