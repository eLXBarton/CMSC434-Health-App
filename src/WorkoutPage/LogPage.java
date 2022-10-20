package WorkoutPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogPage extends JFrame{

    

    public LogPage(JFrame prev, JList<String> list, DefaultListModel<String> real){
        

        JButton submit = new JButton("Submit"), back = new JButton("Back");
        JTextField entry = new JTextField();
        setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        setSize(prev.getSize());
        setPreferredSize(prev.getSize());
    
    
        submit.addActionListener(new ActionListener(){
    
            @Override
            public void actionPerformed(ActionEvent e){
                String text = entry.getText();
                entry.setText("");
                real.addElement(text);
            }
        });

        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                prev.setVisible(true);
                setVisible(false);
            }
        });
    
        con.fill = GridBagConstraints.HORIZONTAL;
    
        con.gridx = 0;
        con.gridy = 0;
        add(entry, con);
        con.gridx = 0;
        con.gridy = 1;
        add(submit, con);
        con.gridx=1;
        con.gridy=0;
        add(list, con);
        con.gridx = 0;
        con.gridy = 2;
        add(back, con);
    }
    
}
