package WorkoutPage;
import javax.swing.*;
import HomePage.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class WorkoutPage{
    public JFrame frame; //this needs to be the container
    JPanel panelWork, panelLog, panelHist, panelHome; //these need to go in the frame
    JButton back, hist, plan, log, profile;
    JTextArea text1;
    java.net.URL web_page;
    JScrollPane scroller;
    DefaultListModel<String> real;
    JList<String> list;

    public WorkoutPage(JFrame prev){
        
        frame = new JFrame();
        hist = new JButton("History");
        plan = new JButton("Plans");
        log = new JButton("Log Workout");
        profile = new JButton("Profile");
        back = new JButton("Back");
        real = new DefaultListModel<String>();
        list = new JList<String>(real);
        text1 = new JTextArea();
        text1.setEditable(false);
		text1.setLineWrap(true);
		text1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		text1.setText("Workouts!");
        text1.setBackground(new Color(255, (int) (105*1.1), (int) (97*1.1)));
		text1.setForeground(Color.WHITE);


        startPage();

        frame.add(panelHome);
        ActionListener profPage = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Profile prof = new Profile(frame);
                prof.frame.setVisible(true);
                frame.setVisible(false);
            }
        };
        profile.addActionListener(profPage);

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
        
        frame.setSize(375,500);
        frame.setPreferredSize(frame.getSize());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    

    void startPage(){
        panelHome = new JPanel();
        panelHome.setLayout(new BorderLayout());
        JPanel north = new JPanel(new GridBagLayout());
        JPanel center = new JPanel(new GridBagLayout());
        GridBagConstraints con1 = new GridBagConstraints();
        GridBagConstraints con2 = new GridBagConstraints();

        con1.fill = GridBagConstraints.HORIZONTAL;
        con1.ipadx = 30;
        con1.weightx = 0;
        con1.weighty = 0;
        con1.insets = new Insets(5,5,0,10);
        con1.gridx = 0;
        con1.gridy = 0;
        north.add(back, con1);
        con1.gridx = 1;
        con1.gridy = 0;
        con1.ipadx=10;
        con1.insets = new Insets(5,10,0,5);
        north.add(profile,con1);
        con1.gridx = 0;
        con1.gridy = 1;
        con1.gridwidth = 3;
        north.add(text1, con1);
        
        north.setBackground(new Color(255, (int) (105*1.1), (int) (97*1.1)));
        

        con2.fill = GridBagConstraints.HORIZONTAL;
        con2.ipadx = 10;
        con2.ipady = 40;
        con2.weightx = 0;
        con2.weighty = 0;
        con2.gridx = 0;
        con2.gridy = 0;
        con2.insets = new Insets(5,5,5,5);
        center.add(log, con2);
        con2.gridx = 1;
        con2.gridy = 0;
        center.add(plan, con2);
        con2.gridx = 0;
        con2.gridy = 1;
        con2.gridwidth = 2;
        center.add(hist, con2);
        
        center.setBackground(new Color(255, (int) (105*1.1), (int) (97*1.1)));

        panelHome.add(north, BorderLayout.NORTH);
        panelHome.add(center, BorderLayout.CENTER);

        panelHome.setSize(375,500);
        panelHome.setPreferredSize(panelHome.getSize());
        
        panelHome.setBackground(new Color(255, (int) (105*1.1), (int) (97*1.1)));
    }
}
