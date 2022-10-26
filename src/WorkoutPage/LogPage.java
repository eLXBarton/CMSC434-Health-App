package WorkoutPage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogPage extends JFrame{

    

    public LogPage(JFrame prev, DefaultListModel<String> real){
        

        JButton submit = new JButton("Submit"), back = new JButton("Back");
        JTextField entry = new JTextField();
        setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        setSize(prev.getSize());
        setPreferredSize(prev.getSize());
        DefaultListModel<String> tempreal = new DefaultListModel<String>();
        JList<String> templist = new JList<String>(tempreal);
    
    
        submit.addActionListener(new ActionListener(){
    
            @Override
            public void actionPerformed(ActionEvent e){
                String text = entry.getText();
                entry.setText("");
                tempreal.addElement(text);
            }
        });

        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                for(int i = 0; i < tempreal.getSize(); i++){
                    real.addElement(tempreal.getElementAt(i));
                }
                prev.setVisible(true);
                setVisible(false);
            }
        });
    
        con.fill = GridBagConstraints.HORIZONTAL;
    
        con.gridx = 0;
        con.gridy = 1;
        con.ipadx = 20;
        add(entry, con);
        con.gridx = 0;
        con.gridy = 2;
        con.ipady = 10;
        add(submit, con);
        con.gridx=1;
        con.gridy=0;
        con.gridheight = 5;
        con.ipady = 0;
        add(templist, con);
        con.gridx = 0;
        con.gridy = 3;
        con.gridheight = 1;
        con.ipady = 10;
        add(back, con);
    }
    
}
