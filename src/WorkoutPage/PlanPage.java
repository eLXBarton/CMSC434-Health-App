package WorkoutPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PlanPage extends JFrame{
    JFrame panelWork;
    
    public PlanPage(JFrame prev){
        JButton back = new JButton("Back"), full_body = new JButton("Full Body (3 Days)"), four = new JButton("Four Days"), cardio = new JButton("Cardio"), cross_fit = new JButton("Cross Fit");
        panelWork = new JFrame();
        panelWork.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        panelWork.setSize(prev.getSize());
        panelWork.setPreferredSize(panelWork.getSize());

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
        con.gridx = 0;
        con.gridy = 2;
        con.gridwidth = 2;
        con.insets = new Insets(30,10,10,10);
        panelWork.add(back, con);
        
    }

    public JFrame getFrame(){
        return panelWork;
    }
}
