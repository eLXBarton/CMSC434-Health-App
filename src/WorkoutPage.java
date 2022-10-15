import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
 
import java.net.URL;

public class WorkoutPage extends JFrame {
    JFrame frame; //this needs to be the container
    JPanel panelWork, panelLog, panelPlan, panelHome; //these need to go in the frame
    JButton settings, back, log, plan, workout;
    JTextArea text1, text2, text3;
    java.net.URL web_page;
    JScrollPane scroller;

    public WorkoutPage(){
        frame = new JFrame();
        log = new JButton("History");
        plan = new JButton("Plans");
        workout = new JButton("Log Workout");
        settings = new JButton("Settings");
        back = new JButton("Back");

        startPage();
        historyPage();
        planPage();

        frame.add(panelWork);
        
        /*TODO: add action listeners for plans, log, and workout
        *   make the pages for those buttons
        *
        */
        
        frame.setSize(300,300);
        frame.setPreferredSize(frame.getSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    void startPage(){
        panelHome = new JPanel();
        panelHome.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        
        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridx = 0;
        con.gridy = 0;
        panelHome.add(back, con);
        con.gridx = 1;
        con.gridy = 0;
        panelHome.add(settings, con);
        con.gridx = 0;
        con.gridy = 1;
        panelHome.add(workout, con);
        con.gridx = 1;
        con.gridy = 1;
        panelHome.add(plan, con);
        con.gridx = 0;
        con.gridy = 2;
        panelHome.add(log, con);

        panelHome.setSize(300,300);
        panelHome.setPreferredSize(panelHome.getSize());

        
    }



    void planPage(){
        JButton full_body = new JButton("Full Body (3 Days)"), four = new JButton("Four Days"), cardio = new JButton("Cardio"), cross_fit = new JButton("Cross Fit");
        panelWork = new JPanel(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        panelWork.setSize(frame.getSize());
        panelWork.setPreferredSize(frame.getSize());

        full_body.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                FullBodyPage page = new FullBodyPage(frame);
                page.setVisible(true);
                frame.setVisible(false);
            }
        });
        four.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                UpperLower page = new UpperLower(frame);
                page.setVisible(true);
                frame.setVisible(false);
            }
        });
        
        con.fill = GridBagConstraints.HORIZONTAL;

        con.gridx = 0;
        con.gridy = 0;
        panelWork.add(full_body, con);
        con.gridx = 1;
        con.gridy = 0;
        panelWork.add(four, con);
        con.gridx = 0;
        con.gridy = 1;
        panelWork.add(cardio, con);
        con.gridx = 1;
        con.gridy = 1;
        panelWork.add(cross_fit, con);
    }

    void historyPage(){
        JButton submit = new JButton("Submit");
        JTextField entry = new JTextField();
        DefaultListModel<String> real = new DefaultListModel<String>();
        JList<String> list = new JList<String>(real);
        panelLog = new JPanel(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        panelLog.setSize(frame.getSize());
        panelLog.setPreferredSize(frame.getSize());


        submit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                String text = entry.getText();
                entry.setText("");
                real.addElement(text);
            }
        });

        con.fill = GridBagConstraints.HORIZONTAL;

        con.gridx = 0;
        con.gridy = 0;
        panelLog.add(entry, con);
        con.gridx = 0;
        con.gridy = 1;
        panelLog.add(submit, con);
        con.gridx=1;
        con.gridy=0;
        panelLog.add(list, con);


    }

    
    public static void main(String[] args) {
        new WorkoutPage();
    }
}
