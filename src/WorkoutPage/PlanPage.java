package WorkoutPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlanPage{
    JFrame panelWork;
    JPanel center;
    
    public PlanPage(JFrame prev){
        JButton back = new JButton("Back"), full_body = new JButton("Full Body (3 Days)"), four = new JButton("Four Days"), cardio = new JButton("Cardio"), cross_fit = new JButton("Calisthenics");
        panelWork = new JFrame();
        center = new JPanel();
        panelWork.setLayout(new BorderLayout());
        center.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        panelWork.setSize(prev.getSize());
        panelWork.setPreferredSize(panelWork.getSize());

        cross_fit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Calisthenics page = new Calisthenics(panelWork);
                page.setVisible(true);
                panelWork.setVisible(false);
            }
        });
        full_body.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                FullBodyPage page = new FullBodyPage(panelWork);
                page.setVisible(true);
                panelWork.setVisible(false);
            }
        });
        four.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                UpperLower page = new UpperLower(panelWork);
                page.setVisible(true);
                panelWork.setVisible(false);
            }
        });
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                prev.setVisible(true);
                panelWork.setVisible(false);
            }
        });
        cardio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Cardio page = new Cardio(panelWork);
                page.setVisible(true);
                panelWork.setVisible(false);
            }
        });
        con.fill = GridBagConstraints.HORIZONTAL;

        con.gridx = 0;
        con.gridy = 0;
        con.insets = new Insets(10,10,10,10);
        center.add(full_body, con);
        con.gridx = 1;
        con.gridy = 0;
        center.add(four, con);
        con.gridx = 0;
        con.gridy = 1;
        center.add(cardio, con);
        con.gridx = 1;
        con.gridy = 1;
        center.add(cross_fit, con);
        con.gridx = 0;
        con.gridy = 2;
        con.gridwidth = 2;
        con.insets = new Insets(30,10,10,10);
        center.add(back, con);
        
        JTextArea text = new JTextArea("Workout Plans!");
        text.setEditable(false);
		text.setLineWrap(true);
		text.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        text.setBackground(new Color(255, (int) (105*1.3), (int) (97*1.3)));
        text.setForeground(Color.WHITE);
        center.setBackground(new Color(255, (int) (105*1.3), (int) (97*1.3)));
        panelWork.add(text, BorderLayout.NORTH);
        panelWork.add(center, BorderLayout.CENTER);
    }

    public JFrame getFrame(){
        return panelWork;
    }
}
