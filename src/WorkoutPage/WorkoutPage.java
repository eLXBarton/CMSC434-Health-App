package WorkoutPage;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class WorkoutPage extends JFrame {
    public JFrame frame; //this needs to be the container
    JPanel panelWork, panelLog, panelHist, panelHome; //these need to go in the frame
    JButton settings, back, hist, plan, log;
    JTextArea text1, text2, text3;
    java.net.URL web_page;
    JScrollPane scroller;
    DefaultListModel<String> real;
    JList<String> list;

    public WorkoutPage(JFrame prev){
        
        frame = new JFrame();
        hist = new JButton("History");
        plan = new JButton("Plans");
        log = new JButton("Log Workout");
        settings = new JButton("Settings");
        back = new JButton("Back");
        real = new DefaultListModel<String>();
        list = new JList<String>(real);

        startPage();

        frame.add(panelHome);


        hist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                HistoryPage panelHist = new HistoryPage(frame, list);
                frame.setVisible(false);
                panelHist.setVisible(true);
            }
        });

        plan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                PlanPage panelWork = new PlanPage(frame);
                JFrame workout = panelWork.getFrame();
                workout.setVisible(true);
                frame.setVisible(false);
            }
        });

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                LogPage panelLog = new LogPage(frame, real);
                frame.setVisible(false);
                panelLog.setVisible(true);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                prev.setVisible(true);
                frame.setVisible(false);
            }
        });
        /*TODO: add action listeners for plans, log, and workout
        *   make the pages for those buttons
        *
        */
        
        frame.setSize(375,500);
        frame.setPreferredSize(frame.getSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    

    void startPage(){
        panelHome = new JPanel();
        panelHome.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        
        con.fill = GridBagConstraints.HORIZONTAL;
        con.ipadx = 10;
        con.ipady = 40;
        con.weightx = 0;
        con.weighty = 0;
        con.insets = new Insets(5,5,50,5);
        con.gridx = 0;
        con.gridy = 0;
        panelHome.add(back, con);
        con.gridx = 1;
        con.gridy = 0;
        panelHome.add(settings, con);
        con.gridx = 0;
        con.gridy = 1;
        con.insets = new Insets(5,5,5,5);
        panelHome.add(log, con);
        con.gridx = 1;
        con.gridy = 1;
        panelHome.add(plan, con);
        con.gridx = 0;
        con.gridy = 2;
        con.gridwidth = 2;
        panelHome.add(hist, con);

        panelHome.setSize(375,500);
        panelHome.setPreferredSize(panelHome.getSize());

        
    }


    
    // public static void main(String[] args) {
    //     new WorkoutPage();
    // }
}
